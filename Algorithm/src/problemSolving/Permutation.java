package problemSolving;

import java.util.*;
class Permutation {
	static int[] pm;
	static int n, m;
	public void DFS(int L){
		if(L==m){ //레벨과 인덱스가 같으면
			for(int x : pm) //배열에 있는거 하나씩 꺼내기
			System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=1; i<=n; i++){
				pm[L]=i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args){
		Permutation T = new Permutation();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt(); //원소 갯수
		m=kb.nextInt(); //인덱스
		pm=new int[m];
		T.DFS(0);
		
		String s = "";
		String newStr = "";
		StringBuilder str = new StringBuilder();
		for(int i = 0 ;i <= s.length();i++) {
			if(i==0) {
				newStr+=s.toUpperCase();
			}
			else if(i%2==0) {
				newStr+=s.toUpperCase();
			}
			else {
				newStr+=s.toLowerCase();
			}
		}
	}
}