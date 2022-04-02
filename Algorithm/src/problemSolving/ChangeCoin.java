package problemSolving;

import java.util.Scanner;

public class ChangeCoin {
	static int n,m,answer = Integer.MAX_VALUE;
	public void DFS(int L, int sum, int[] arr) {
		if(sum>m)
			return;
		if(sum==m) {
			answer = Math.min(L, answer);
		}else {
			for(int i = 0 ; i<n;i++) {
				DFS(L+1,sum+arr[i],arr);
			}
		}
	}
	
	public static void main(String[] args) {
		ChangeCoin t = new ChangeCoin();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); //µ¿ÀüÀÇ °¹¼ö
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = scan.nextInt();
		m = scan.nextInt();
		t.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
