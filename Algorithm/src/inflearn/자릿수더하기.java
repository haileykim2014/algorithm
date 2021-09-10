package inflearn;

import java.util.Scanner;

public class 자릿수더하기 {
	
	public int solution(int n) {
		int sum = 0;
		
		while(true) {
			sum += n%10;
			
			if(n<10)
			break;
			
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args){
		자릿수더하기 t = new 자릿수더하기();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(t.solution(num));
	}

}
