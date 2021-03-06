package problemSolving;

import java.util.*;
class Point{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}
class Tomato {
	static int[] dx={-1, 0, 1, 0};//동서남북
	static int[] dy={0, 1, 0, -1};
	static int[][] board, dis; //미로, 거리
	static int n, m; //행,열
	static Queue<Point> Q=new java.util.LinkedList();
	public void BFS(){
		while(!Q.isEmpty()){ //큐가 빌때까지 반복
			Point tmp=Q.poll();//큐에서 하나씩 꺼내기
			for(int i=0; i<4; i++){
				int nx=tmp.x+dx[i]; //기준의 동서남북 좌표 하나씩
				int ny=tmp.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){ //범위에맞으면
					board[nx][ny]=1;//근처 익는 토마토
					Q.offer(new Point(nx, ny));
					dis[nx][ny]=dis[tmp.x][tmp.y]+1;
				}
			}
		}	
	}

	public static void main(String[] args){
		Tomato T = new Tomato();
		Scanner kb = new Scanner(System.in);
		m=kb.nextInt();
		n=kb.nextInt();
		board=new int[n][m];
		dis=new int[n][m];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				board[i][j]=kb.nextInt(); //여러개의 시작점에서 모든 지점으로의 거리를 구해야한다.
				if(board[i][j]==1) //익은 토마토 위치를 큐에 넣는다 , 1인 지점의 좌표를 미리 넣는다
					Q.offer(new Point(i, j));//거리순으로 좌표가 쌓인다
			}
		}
		T.BFS();
		boolean flag=true;
		int answer=Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(board[i][j]==0) flag=false;
			}
		}
		if(flag){
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					answer=Math.max(answer, dis[i][j]); //다 익은 토마토중에서 익는데 가장 오래걸린것출력
				}
			}
			System.out.println(answer);
		}
		else System.out.println(-1);
	}
}