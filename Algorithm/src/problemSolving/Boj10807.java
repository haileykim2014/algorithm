package problemSolving;

import java.util.Scanner;

public class Boj1267 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		//통화한 갯수
		int n = sc.nextInt();
		//통화한 시간
		int min = 0;
		//요금제 종류
		int y=0,m =0;
		
		for(int i=0;i<n;i++) {
			min = sc.nextInt();
			y += (min/30+1)*10;
			m += (min/60+1)*15;
		}
		// 두 요금제 금액이 같다면
		if(y==m) {
			System.out.println("Y M"+y);
		//용식이가 저렴하다면	
		}else if(y<m) {
			System.out.println("Y "+y);
		}else {
			System.out.println("M "+m);
		}
	}

}
