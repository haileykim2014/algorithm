package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class May7 {
	public String solution(String a, String b){
		String answer = "yes";
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x:a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
			//getOrDefault ã�� Ű�� �����ϸ� �ش� Ű���� ��ȯ,������ 0
		}
		for(char x:b.toCharArray()) {
			if(!map.containsKey(x)|| map.get(x) == 0)
				return "no";
			//getOrDefault ã�� Ű�� �����ϸ� �ش� Ű���� ��ȯ,������ 0
		}
		return answer;
	}

	public static void main(String[] args){
		May7 T = new May7();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.println(T.solution(a, b));
		//�ִٸ� -1
		//x���Ű�� �����ϴ� ? ����������������, �Ǵ� x���� Ű�ǰ��� 0�̸� 
	}
}