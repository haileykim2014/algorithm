package problemSolving;

import java.util.Scanner;

public class 최대공약수 {
	static int a, b; public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		a = sc.nextInt(); 
		b = sc.nextInt();
		
		int min = (a < b) ? a : b;
		// 참이면 a이고 아니면 b 인거지. 
		int gcd = 0;
		for (int i = 1; i <= min; i++) {//최소숫자만큼 반복
			if (a % i == 0 && b % i == 0) 
				gcd = i;
			} System.out.println("최대공약수 : " + gcd);
			System.out.println("최소공배수 : " + a * b / gcd);
			}
	}
	
