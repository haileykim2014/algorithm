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

public class May16a {

	public static String solution(String str) {
		String answer ="";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x==')') {//�ݴ°�ȣ���
				while(stack.pop()!='(');//���°�ȣ������������ pop
			}else {
				stack.push(x);//���°�ȣ�� push
			}
		}for(int i=0;i<stack.size();i++)//stack���ִ� ���Ұ�����ŭ ������
			answer += stack.get(i);
		return answer;
	}
	
	public static void main(String[] args){
		May16a T = new May16a();

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.solution(str));
	}
}

