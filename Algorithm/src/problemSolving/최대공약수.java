package problemSolving;

import java.util.Scanner;

public class �ִ����� {
	static int a, b; public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���.");
		a = sc.nextInt(); 
		b = sc.nextInt();
		
		int min = (a < b) ? a : b;
		// ���̸� a�̰� �ƴϸ� b �ΰ���. 
		int gcd = 0;
		for (int i = 1; i <= min; i++) {//�ּҼ��ڸ�ŭ �ݺ�
			if (a % i == 0 && b % i == 0) 
				gcd = i;
			} System.out.println("�ִ����� : " + gcd);
			System.out.println("�ּҰ���� : " + a * b / gcd);
			}
	}
	
