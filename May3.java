package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class May3 {
	public int solution(int n){
		int answer = 0, cnt =1;
		n--;//점차작아진다
		while(n>0) {
			cnt++;
			n=n-cnt;//n에서 cnt갯수를 빼고// n에서 1과 2뺀것
			if(n%cnt==0) answer++; //cnt갯수만큼 나눠서 떨어지면 연속된자연수가능
		}
		return answer;
	}

	public static void main(String[] args){
		May3 T = new May3();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(T.solution(n));
	}

} 