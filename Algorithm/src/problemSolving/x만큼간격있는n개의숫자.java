package problemSolving;

import java.util.Scanner;

import inflearn.�ڸ������ϱ�;

public class x��ŭ�����ִ�n���Ǽ��� {
	
	public long[] solution(long x,int n) {
		long[] answer = new long[n]; //�迭�ε����ֱ�
		long temp = x;//�Է¹��� ������ �ڿ���
		
		for(int i=0;i<n;i++) {
			answer[i] = temp*(i+1);
		}
		return answer;
		
	}
	
	public static void main(String[] args){
		x��ŭ�����ִ�n���Ǽ��� t = new x��ŭ�����ִ�n���Ǽ���();
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		long[] arr = new long[n];
		
		for(int i=0;i<n;i++) {		
			arr = t.solution(x, n);
			System.out.print(arr[i]+" ");
		}
	}

}
