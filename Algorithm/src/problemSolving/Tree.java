package problemSolving;

import java.util.*;
class Tree {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v){
		if(v==n) answer++; //끝 노드까지 갔으면 answer++
		else{
			for(int i=1; i<=n; i++){
				if(graph[v][i]==1 && ch[i]==0){ //방향이 존재하고(지도 위치에 맞고) & 방문한 적이 없다면
					ch[i]=1; //이제 방문했으니까 체크
					DFS(i); //해당 노드의 child노드들 파악
					ch[i]=0; //되돌아 가기위한 비방문 체크 (부모노드로 돌아가고 다시 i를 체크할 수 있기위한것 
				}
			}
		}
	}
	
	public static void main(String[] args){
		Tree T = new Tree();
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt(); //정점 수
		m=scan.nextInt(); //간선 수
		graph=new int[n+1][n+1];//간선 위치정보
		ch=new int[n+1]; //방문 여부
		for(int i=0; i<m; i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			graph[a][b]=1; //지도그리기
		}
		ch[1]=1; //시작점 방문체크
		T.DFS(1);
		System.out.println(answer);
	}	
}