package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MayFirst1 {
	public int solution(int a, int b, int[] arr1) {
		int answer, sum = 0;
		for(int i=0;i<b;i++)
			sum += arr1[i];
			answer = sum;
		for(int i=b;i<a;i++) {
			sum += (arr1[i] - arr1[i-b]);
			answer = Math.max(answer, sum);			
		}
		return answer;
	}
	public static void main(String[] args){
		MayFirst1 T = new MayFirst1();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr1 = new int[n];
		for(int i
				=0;i<n;i++)
			arr1[i]= scan.nextInt();
		
		System.out.println(T.solution(n, m, arr1));
	}

}