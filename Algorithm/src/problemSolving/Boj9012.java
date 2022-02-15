package problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj2504 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		boolean flag = true;
		int answer = 0;
		int temp = 1;
		
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '(') {
				stack.push(c);
				temp*=2;
			}
			else if(c == '[') {
				stack.push(c);
				temp*=3;
			}
			else {
				if(c==')') {
					if(stack.isEmpty()||stack.peek()!='(') {
						flag= false;
						break;
					}
					if(str.charAt(i-1) == '(') {
						answer+=temp;
					}
					stack.pop();
					temp/=2;
				}else if(c==']') {
					if(stack.isEmpty()||stack.peek()!='[') {
						flag=false;
						break;
					}
					if(str.charAt(i-1) == '[') {
						answer += temp;
					}
					stack.pop();
					temp/=3;//[]하나 없어졌으므로 3으로 나누기
				}
				else {
					flag = false;
					break;
				}
			}
		}
		if(!flag||!stack.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(answer);
		}

	}
}
