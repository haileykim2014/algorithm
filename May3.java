package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class May3 {
	public int solution(int n){
		int answer = 0, cnt =1;
		n--;//�����۾�����
		while(n>0) {
			cnt++;
			n=n-cnt;//n���� cnt������ ����// n���� 1�� 2����
			if(n%cnt==0) answer++; //cnt������ŭ ������ �������� ���ӵ��ڿ�������
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