package inflearn;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class May31 {//필수과목순서,
	private String solution(String n,String k) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();//큐선언, 타입은 인티저
		
		for(char x : n.toCharArray())
			q.offer(x);//필수과목순서대로넣기
		for(char x: k.toCharArray()) {//수업계획서
			if(q.contains(x)) {// q안에있는지
				if(x!=q.poll())
					return "no";
			}
		}
		if(!q.isEmpty())//뭔가 남아있을때
			return "no";
		return answer;
	}
	
	
	public static void main(String[] args) {
		May31 t = new May31();
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String k = scan.next();
		System.out.println(t.solution(n,k));
	}


}
