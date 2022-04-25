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
	static int[][] board, dis; //distance배열 
	public void BFS(int x,int y) {
		Queue<Point> q = new java.util.LinkedList();
		q.offer(new Point(x,y));//기준점 큐에 넣기
		board[x][y]=1; //시작점 방문표시
		while(!q.isEmpty()) {
			Point tmp = q.poll();//큐에 넣은 기준값 빼기
			for(int i = 0; i<4 ; i++) {
				int nx = tmp.x + dx[i]; //뺀 기준값 x측의 상하좌우
				int ny = tmp.y + dy[i]; //뺸 기준값 y측의 상하좌우
				if(nx>=1 && nx <= 7 && ny>=1 && ny <=7 && board[nx][ny] ==0) {
					board[nx][ny]=1; // 시작점 방문 표시
					q.offer(new Point(nx,ny)); //새로운 좌표 넣기
					dis[nx][ny] = dis[tmp.x][tmp.y]+1; //거리담기
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
