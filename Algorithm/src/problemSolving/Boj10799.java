package problemSolving;

import java.util.Scanner;
import java.util.Stack;

public class Boj10799 {
	private int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {//입력받은 문자열길이 만큼 for문돌리기
			if(str.charAt(i)=='(')// 문자열 순서대로 여는괄호인지 비교
				stack.push('(');//여는괄호 스택에 넣기
			else {//닫는괄호라면
				stack.pop();
				if(str.charAt(i-1)=='(')//바로앞지점이 여는괄호라면 레이저지점
					answer += stack.size();//막대기 갯수세기			
				else answer++;//막대기끝이면 꺼내기, 닫는괄호의 앞이 닫는괄호면 막대기끝,지금까지더한값에 1증가
			}
		}		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Boj10799 t = new Boj10799();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(t.solution(str));
	}


}
