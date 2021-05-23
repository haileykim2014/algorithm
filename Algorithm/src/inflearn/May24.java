package inflearn;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class May24 {
	private int solution(int n,int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();//큐선언, 타입은 인티저
		for(int i = 1; i<=n ;i++)
			q.offer(i);//q에 i넣기
			while(!q.isEmpty()){//비어있을때 반복이 멈춘다,스택,큐 isEmpty
				for(int i =1;i<k;i++) 
					q.offer(q.poll());//poll꺼내서 값을 리턴받는다. 다시 offer넣는다.
					q.poll();//꺼내기
					if(q.size()==1)
						answer = q.poll();
				
			}

		return answer;
	}
	
	
	public static void main(String[] args) {
		May24 t = new May24();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(t.solution(n,k));
	}


}
