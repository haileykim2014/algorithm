package problemSolving;

import java.util.*;
class SubSet{
	static String answer="NO"; //존재하지 않는다로 기본answer 설정
	static int n, total=0;//원소 갯수, 원소들의 합
	boolean flag=false;//존재
	public void DFS(int L, int sum, int[] arr){
		if(flag) return;//Yes가 발견되면 다음 재귀는 다 리턴시키기 위한 조건
		if(sum>total/2) return; //다른 경로를 파악하도록 return으로 종료
		if(L==n){
			if((total-sum)==sum){
				answer="YES";
				flag=true;//다음 재귀는 리턴시키기
			}	
		}
		else{//두 갈래로 갈린다. 다음원소를 사용하는것, 안하는것
			DFS(L+1, sum+arr[L], arr); //다음레벨에서 arr[L] 원소를 사용한다
			DFS(L+1, sum, arr); //다음레벨에서 arr[L] 원소를 사용 안한다
		}
	}
	public static void main(String[] args){
		SubSet T = new SubSet();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}