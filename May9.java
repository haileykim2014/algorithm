package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class May9 {
	public ArrayList<Integer> solution(int n,int k,int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<k-1;i++) {//먼저 k-1까지 HashMap에 담기
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		int lt =0;
		for(int rt=k-1; rt<n;rt++) {
			hm.put(arr[rt], hm.getOrDefault(arr[rt], 0)+1);
			answer.add(hm.size());
			hm.put(arr[lt],hm.get(arr[lt])-1);
			if(hm.get(arr[lt])==0)
				hm.remove(arr[lt]);
			lt++;
		}
		return answer;
	}

	public static void main(String[] args){
		May9 T = new May9();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr =new int[n];//일수
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		for(int x:T.solution(n,k,arr))
			System.out.println(x+"");
		//있다면 -1
		//x라는키가 존재하니 ? 존재하지않을때참, 또는 x란느 키의값이 0이면 
	}
}