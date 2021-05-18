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
		for(char x:str.toCharArray()) {//���ڿ��� ���ڹ迭����Ƽ� �ϳ���������
			if(Character.isDigit(x)) {//x�� ���ڸ� true
				stack.push(x-48);//x�� ���� �ƽ�Ű�ڵ�->���ڷ� ��ȯ
			}
			else {//x�� �����ڶ�� ���ڵΰ��� ������.
				int rt = stack.pop();//rt�� �� ���ڴ���
				int lt = stack.pop();//lt�� �� ���ڴ���
				if(x=='+')//ùif������ �����ΰ͵��� ���ں�ȯ�ĳ־��⋚���� �Ǽ��ں�ȯ�ʿ����
					stack.push(lt+rt);//�� ���ڴ��ϰ� stack�� �ֱ�
				else if(x=='-')
					stack.push(lt-rt);
				else if(x=='*')
					stack.push(lt*rt);
				else if(x=='/')
					stack.push(lt/rt);
			}
			
		}//for���� ������ stack�� 0��° ��������
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