package problemSolving;

import java.util.Scanner;

public class FindPermutation {
	static int[] pm, ch, arr;
	static int n, m;
	public void DFS(int L){
		if(L==m){
			for(int x : pm) System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=0; i<n; i++){
				if(ch[i]==0){
					ch[i]=1;
					pm[L]=arr[i];
					DFS(L+1);
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args){
		FindPermutation T = new FindPermutation();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		arr=new int[n]; //주어진 자연수 담을 배열
		for(int i=0; i<n; i++) 
			arr[i]=kb.nextInt(); //주어진 자연수 넣기
		ch=new int[n]; //방문 확인용
		pm=new int[m]; //수열담을 배열
		T.DFS(0);
	}
}
