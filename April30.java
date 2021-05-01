package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class April30 {
	public ArrayList<Integer> solution(int a, int b, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1);//오름차순정렬
		Arrays.sort(arr2);
		int p1=0, p2=0;
		while(p1<a && p2<b){
			if(arr1[p1]==arr2[p2]){
				answer.add(arr1[p1++]);//같을때 동시증가
				p2++;
			}
			else if(arr1[p1]<arr2[p2]) p1++; //작은배열먼저증가
			else p2++;
		}
		return answer;
	}
	public static void main(String[] args){
		April30 T = new April30();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		for(int i
				=0;i<n;i++)
			arr1[i]= scan.nextInt();
		
		int m = scan.nextInt();
		int arr2[] = new int[m];
		for(int j=0;j<m;j++)
			arr2[j]=scan.nextInt();		
		
		System.out.println(T.solution(n, m, arr1, arr2));
	}


}