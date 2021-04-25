package testPackage;

import java.util.Scanner;

public class Test {
	public static int solution(int n,int[][] arr) {
		int answer = Integer.MIN_VALUE;// 최대값대입해야하므로 최소값으로 초기화
		int sum1,sum2;//행의 합,열의합
		for(int i=0;i<n;i++) {
			sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1 += arr[i][j];//각 행의 합
				sum2 += arr[j][i];//각 열의 합
			}
			answer = Math.max(answer, sum1);//행의 최대값
			answer = Math.max(answer, sum2);//열합의 최대값			
		}		
		sum1 =sum2 =0;
		for(int i=0;i<n;i++) {
			sum1 +=arr[i][i];//대각선의합
			sum2 +=arr[i][n-i-1];			
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	}

	public static void main(String[] args) {
		Test t = new Test();
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a = 0;
		int[][] arr=new int[n][n];
		int[]answer=new int[n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=scan.nextInt();
			}
		}
			System.out.println(t.solution(n, arr));

	}
}



