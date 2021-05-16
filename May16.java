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
		String answer = "YES"; //기본값 예스설정(올바른괄호)
		Stack<Character> stack = new Stack<>();//괄호문제는 거의 스택구조
		for(char x : str.toCharArray()) {//String을 문자 배열에넣고 x에 하나씩뽑기
			if(x == '(')//여는 괄호라면
				stack.push(x);//스택에 여는 괄호 넣기
			else {//닫는괄호면, 여는괄호 pop
				if(stack.isEmpty())//스택이비었다면 No반환, 여는괄호가없다면
					return "NO";
					stack.pop();//스택이 비어있지않다면 하나빼기
			}
		}//여는괄호가 많은상황
		if(!stack.isEmpty())//스택에 자료가남아있으면
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

