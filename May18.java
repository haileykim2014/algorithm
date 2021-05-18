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

public class May18 {

	public static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(char x:str.toCharArray()) {//문자열을 문자배열에담아서 하나씩꺼내기
			if(Character.isDigit(x)) {//x가 숫자면 true
				stack.push(x-48);//x는 문자 아스키코드->숫자로 변환
			}
			else {//x가 연산자라면 숫자두개를 꺼낸다.
				int rt = stack.pop();//rt에 뺀 숫자대입
				int lt = stack.pop();//lt에 뺀 숫자대입
				if(x=='+')//첫if문에서 숫자인것들은 숫자변환후넣었기떄문에 또숫자변환필요없음
					stack.push(lt+rt);//두 숫자더하고 stack에 넣기
				else if(x=='-')
					stack.push(lt-rt);
				else if(x=='*')
					stack.push(lt*rt);
				else if(x=='/')
					stack.push(lt/rt);
			}
			
		}//for문이 끝나면 stack에 0번째 값꺼내기
		answer = stack.get(0);
		return answer;
		
	}
	
	public static void main(String[] args){
		May18 t = new May18();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(t.solution(str));
		}

}