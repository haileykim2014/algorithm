package problemSolving;

import java.util.*;
class Combination{
	static int[] combi;
	static int n, m;
	public void DFS(int L, int s){
		if(L==m){//조합이 완성됐을때
			for(int x : combi) 
				System.out.print(x+" ");
				System.out.println();
		}
		else{//조합을 만들때
			for(int i=s; i<=n; i++){
				combi[L]=i; //레벨을 인덱스로하는 배열에 합계를 대입
				DFS(L+1, i+1); //다음 레벨, 다음합계
			}
		}
	}
	public static void main(String[] args){
		Combination T = new Combination();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		combi=new int[m];
		T.DFS(0, 1);
	}
}