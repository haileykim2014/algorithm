package inflearn;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class June5th {	
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x:arr) {//x가 캐시에있는지없는지 확인
			int pos = -1;
			for(int i=0;i<size;i++)
				if(x==cache[i])//캐시에 같은 값이있는지?
					pos =i;
			if(pos==-1) {//miss라면, 해야할 작업이 캐시에없는상태
				for(int i=size-1;i>=1;i--) {//히트난지점부터 for문돌리기
					cache[i]=cache[i-1];
				}
				cache[0] =x;//arr의 현재x값이 0번쨰인덱스에온다
			}
			else {//히트일때, 해야할 작업이 캐시에없을때
				for(int i=pos;i>=1;i--) {
					cache[i]=cache[i-1];
				}
				cache[0]=x;
			}
		}
		return cache;
	}
	public static void main(String[] args){
		June5th T = new June5th();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();//캐시사이즈
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) 
			arr[i]=kb.nextInt();
		for(int x : T.solution(s,n, arr)) 
			System.out.print(x+" ");
	}
}