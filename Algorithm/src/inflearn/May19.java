package inflearn;
import java.util.Scanner;
import java.util.Stack;

public class May19 {
	private int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(')
				stack.push('(');//여는괄호 넣기
			else {
				stack.pop();
				if(str.charAt(i-1)=='(')
					answer += stack.size();
				else answer++;
			}
		}		
		return answer;
	}
	
	
	public static void main(String[] args) {
		May19 t = new May19();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(t.solution(str));
	}


}
