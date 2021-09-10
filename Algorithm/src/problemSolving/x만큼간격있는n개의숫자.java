package problemSolving;

import java.util.Scanner;

import inflearn.자릿수더하기;

public class x만큼간격있는n개의숫자 {
	
	public long[] solution(long x,int n) {
		long[] answer = new long[n]; //배열인덱스넣기
		long temp = x;//입력받은 시작할 자연수
		
		for(int i=0;i<n;i++) {
			answer[i] = temp*(i+1);
		}
		return answer;
		
	}
	
	public static void main(String[] args){
		x만큼간격있는n개의숫자 t = new x만큼간격있는n개의숫자();
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
