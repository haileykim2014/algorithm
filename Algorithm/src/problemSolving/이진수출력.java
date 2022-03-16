package problemSolving;

import java.util.*;
class 이진수출력 {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n/2);
			System.out.print(n%2);
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		이진수출력 T = new 이진수출력();
		T.solution(11);
		//System.out.println(T.solution(3));
	}	
}
