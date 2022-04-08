package problemSolving;

import java.util.*;
class Memoization{
	int[][] dy=new int[35][35];
	public int DFS(int n, int r){//n행 r열 ,n개중 r개 뽑는다.
		if(dy[n][r]>0) //n행r열에 값이 있다면, 
			return dy[n][r]; //미리 구한 값 리턴
		if(n==r || r==0) return 1; //제일 하단
		else return dy[n][r]=DFS(n-1, r-1)+DFS(n-1, r); 
		//n개중 r개를 뽑는다 = n-1개중 r-1개를 뽑기 + n-1개중 r개뽑기
	}
	public static void main(String[] args){
		Memoization T = new Memoization();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt(); //n개중
		int r=kb.nextInt(); //r개를 뽑는다
		System.out.println(T.DFS(n, r));
	}
}