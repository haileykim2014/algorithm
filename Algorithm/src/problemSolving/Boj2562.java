package problemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class Boj2562 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		//������ ����ؾ��ϹǷ� �ε���1����ä���
		for(int i=1;i<arr.length;i++) {//�� 9���ݺ�
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		int max = -10; //�ִ밪�� ���� ���������� ����
		
		for(int i=1;i<arr.length;i++) {// �� 9���ݺ�
			if(arr[i]>max) {//�ִ밪���� �迭�� ���� ũ�� ����ġ
				max = arr[i];
				count = i;
			}
		}
		
		System.out.println(max);
		System.out.println(count);
		
	}
	
}
