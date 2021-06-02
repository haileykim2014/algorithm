package inflearn;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class June2nd {	
	public int[] solution(int n, int[] arr){
		for(int i=1; i<n; i++){ //1번인덱스부터
			int tmp = arr[i],j;
			for(j=i-1;j>=0;j--) { //앞인덱스로간다
				if(arr[j]>tmp) //크면 뒤로민다.
					arr[j+1]=arr[j];
				else break;//멈추기 for문빠져나간다
			}
		arr[j+1] =tmp;//멈춘자리 뒤에서 템프에넣는다
	}
		return arr;
	}
	public static void main(String[] args){
		June2nd T = new June2nd();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}