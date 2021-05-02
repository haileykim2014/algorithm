package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class May2 {
	public int solution(int n){
		int answer=0, sum=0, lt=0;
		int m = n/2+1;
		int[] arr = new int[m];;
		for(int i=0;i<m;i++) {
			arr[i]= i+1;			
		}
		for(int rt=0; rt<m; rt++){
			sum = sum + arr[rt];
			if(sum==n) answer++;
			while(sum>=n){
				sum-=arr[lt++]; //lt는 아직증가안함.
				if(sum==n) answer++; 
			}
		}
		return answer;
	}

	public static void main(String[] args){
		May2 T = new May2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(T.solution(n));
	}

}