package problemSolving;

import java.util.Scanner;

public class Boj1267 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		//��ȭ�� ����
		int n = sc.nextInt();
		//��ȭ�� �ð�
		int min = 0;
		//����� ����
		int y=0,m =0;
		
		for(int i=0;i<n;i++) {
			min = sc.nextInt();
			y += (min/30+1)*10;
			m += (min/60+1)*15;
		}
		// �� ����� �ݾ��� ���ٸ�
		if(y==m) {
			System.out.println("Y M"+y);
		//����̰� �����ϴٸ�	
		}else if(y<m) {
			System.out.println("Y "+y);
		}else {
			System.out.println("M "+m);
		}
	}

}
