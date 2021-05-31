package inflearn;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Person {
	int id;
	int priority;
	public Person(int id, int priority) {//클래스형으로넣는다
		this.id = id;
		this.priority = priority;
	}
}

class June1{
	public int solution (int n, int m,int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			Q.offer(new Person(i,arr[i]));//i번쨰 객체를만들면서 q에 넣는다.
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x:Q) {
				if(x.priority>tmp.priority) {
					Q.offer(tmp);//다시넣는다
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m)
					return answer;
			}
		}
		return answer;
	}

	
	
	public static void main(String[] args) {
		June1 t = new June1();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		System.out.println(t.solution(n,m,arr));
	}


}
