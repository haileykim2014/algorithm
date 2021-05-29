package inflearn;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class May27 {
	private String solution(String n,String k) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();//큐선언, 타입은 인티저
		
		for(char x : n.toCharArray())
			q.offer(x);
		for(char x: k.toCharArray()) {
			if(q.contains(x)) {
				if(x!=q.poll())
					return "no";
			}
		}
		if(!q.isEmpty())
			return "no";
		return answer;
	}
	
	
	public static void main(String[] args) {
		May27 t = new May27();
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String k = scan.next();
		System.out.println(t.solution(n,k));
	}


}
