package problemSolving;

import java.util.*;
class ExpectProgression{
	static int[] b, p, ch; //b : comi저장, p : 수열담을 배열, ch : 체크배열
	static int n, f; //n:받을 숫자 갯수, f:가장 밑에있는 숫자
	boolean flag=false; //답을 찾으면 멈춘다.
	int[][] dy=new int[35][35]; 
	public int combi(int n, int r){ //메모이제이션
		if(dy[n][r]>0) return dy[n][r]; //미리 구한값이라면 구했던 거쓰기
		if(n==r || r==0) return 1;//마지막 노드라면 1을 리
		else return dy[n][r]=combi(n-1, r-1)+combi(n-1, r);
	}

	public void DFS(int L, int sum){
		if(flag) return;
		if(L==n){
			if(sum==f){
				for(int x : p) System.out.print(x+" ");
				flag=true;
			}
		}
		else{ //순열만들기
			for(int i=1; i<=n; i++){//i자체가 순열만드는 숫자
				if(ch[i]==0){ //사용했니
					ch[i]=1; //i를 사용했다
					p[L]=i; //i자체를 넣기
					DFS(L+1, sum+(p[L]*b[L]));
					ch[i]=0; //사용해제
				}
			}
		}
	}

	public static void main(String[] args){
		ExpectProgression T = new ExpectProgression();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt(); // 가장 윗줄에 있는 숫자의 개수
		f=kb.nextInt(); // 가장 밑에 있는 수
		b=new int[n]; 
		p=new int[n];
		ch=new int[n+1]; //1부터 n까지 숫자 , 인덱스번호 사용
		for(int i=0; i<n; i++){
			b[i]=T.combi(n-1, i);
		}
		T.DFS(0, 0);
	}
}