package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class May16 {

	public static String solution(String str) {
		String answer = "YES"; //�⺻�� ��������(�ùٸ���ȣ)
		Stack<Character> stack = new Stack<>();//��ȣ������ ���� ���ñ���
		for(char x : str.toCharArray()) {//String�� ���� �迭���ְ� x�� �ϳ����̱�
			if(x == '(')//���� ��ȣ���
				stack.push(x);//���ÿ� ���� ��ȣ �ֱ�
			else {//�ݴ°�ȣ��, ���°�ȣ pop
				if(stack.isEmpty())//�����̺���ٸ� No��ȯ, ���°�ȣ�����ٸ�
					return "NO";
					stack.pop();//������ ��������ʴٸ� �ϳ�����
			}
		}//���°�ȣ�� ������Ȳ
		if(!stack.isEmpty())//���ÿ� �ڷᰡ����������
			return "NO";
		return answer;		
	}
	
	public static void main(String[] args){
		May16 T = new May16();

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.solution(str));
	}
}

