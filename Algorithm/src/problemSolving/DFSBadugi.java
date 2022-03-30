package problemSolving;

import java.util.Scanner;

public class DFSBadugi {
	static int answer = Integer.MIN_VALUE,c,n;
	public void DFS(int L, int sum, int[] arr) {
		if(sum>c) //한정 무게초과하면 리턴
			return;
		if(L==n) {//강아지 다 태웠을때
			answer = Math.max(answer, sum);
		}
		else {//다음레벨측정
			DFS(L+1,sum+arr[L],arr); //한마리채운다
			DFS(L+1,sum,arr); //안채운다
		}
	}
	public static void main(String[] args) {
		DFSBadugi t = new DFSBadugi();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		t.DFS(0,0,arr);
		System.out.println(answer);
	}
}
