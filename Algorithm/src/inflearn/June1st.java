package inflearn;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class June1st {
	public int[] solution(int n,int[] arr) {
		for(int i=0;i<n-1;i++) {
			int idx = i;//인덱스번호지정
			for(int j=i+1;j<n;j++) {//j는 인덱스번호다음부터
				if(arr[idx]>arr[j])
					idx = j;//작은값의 인덱스번호넣기
				}
			int tmp = arr[i];//위치바꾸기
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		June1st T = new June1st();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] = scan.nextInt();
		for(int x:T.solution(n, arr))
			System.out.println(x+" ");
	}


}
