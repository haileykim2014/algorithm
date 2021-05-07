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
			//getOrDefault 찾는 키가 존재하면 해당 키값을 반환,없으면 0
		}
		for(char x:b.toCharArray()) {
			if(!map.containsKey(x)|| map.get(x) == 0)
				return "no";
			//getOrDefault 찾는 키가 존재하면 해당 키값을 반환,없으면 0
		}
		return answer;
	}

	public static void main(String[] args){
		May7 T = new May7();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.println(T.solution(a, b));
		//있다면 -1
		//x라는키가 존재하니 ? 존재하지않을때참, 또는 x란느 키의값이 0이면 
	}
}