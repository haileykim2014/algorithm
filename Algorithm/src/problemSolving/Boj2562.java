package problemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class Boj2562 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		//순서를 출력해야하므로 인덱스1부터채우기
		for(int i=1;i<arr.length;i++) {//총 9번반복
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		int max = -10; //최대값을 가장 작은값으로 시작
		
		for(int i=1;i<arr.length;i++) {// 총 9번반복
			if(arr[i]>max) {//최대값보다 배열의 값이 크면 스위치
				max = arr[i];
				count = i;
			}
		}
		
		System.out.println(max);
		System.out.println(count);
		
	}
	
}
