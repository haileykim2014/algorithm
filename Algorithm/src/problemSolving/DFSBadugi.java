package problemSolving;

import java.util.Scanner;

public class DFSBadugi {
	static int answer = Integer.MIN_VALUE,c,n;
	public void DFS(int L, int sum, int[] arr) {
		if(sum>c) //���� �����ʰ��ϸ� ����
			return;
		if(L==n) {//������ �� �¿�����
			answer = Math.max(answer, sum);
		}
		else {//������������
			DFS(L+1,sum+arr[L],arr); //�Ѹ���ä���
			DFS(L+1,sum,arr); //��ä���
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
