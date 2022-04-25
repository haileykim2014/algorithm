package problemSolving;

import java.util.*;

class Point{
	public int x, y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}
public class ShortestRoute {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int[][] board, dis; //distance�迭 
	public void BFS(int x,int y) {
		Queue<Point> q = new java.util.LinkedList();
		q.offer(new Point(x,y));//������ ť�� �ֱ�
		board[x][y]=1; //������ �湮ǥ��
		while(!q.isEmpty()) {
			Point tmp = q.poll();//ť�� ���� ���ذ� ����
			for(int i = 0; i<4 ; i++) {
				int nx = tmp.x + dx[i]; //�� ���ذ� x���� �����¿�
				int ny = tmp.y + dy[i]; //�A ���ذ� y���� �����¿�
				if(nx>=1 && nx <= 7 && ny>=1 && ny <=7 && board[nx][ny] ==0) {
					board[nx][ny]=1; // ������ �湮 ǥ��
					q.offer(new Point(nx,ny)); //���ο� ��ǥ �ֱ�
					dis[nx][ny] = dis[tmp.x][tmp.y]+1; //�Ÿ����
				}
			}
		}
	}
	public static void main(String[] args) {
		ShortestRoute t = new ShortestRoute();
		Scanner scan = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for(int i=1;i<=7;i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		t.BFS(1, 1);
		if(dis[7][7]==0)
			System.out.println(-1);
		else
			System.out.println(dis[7][7]);
		
	}
}
