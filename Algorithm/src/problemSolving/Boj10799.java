package problemSolving;

import java.util.Scanner;
import java.util.Stack;

public class Boj10799 {
	private int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {//�Է¹��� ���ڿ����� ��ŭ for��������
			if(str.charAt(i)=='(')// ���ڿ� ������� ���°�ȣ���� ��
				stack.push('(');//���°�ȣ ���ÿ� �ֱ�
			else {//�ݴ°�ȣ���
				stack.pop();
				if(str.charAt(i-1)=='(')//�ٷξ������� ���°�ȣ��� ����������
					answer += stack.size();//����� ��������			
				else answer++;//����ⳡ�̸� ������, �ݴ°�ȣ�� ���� �ݴ°�ȣ�� ����ⳡ,���ݱ������Ѱ��� 1����
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
