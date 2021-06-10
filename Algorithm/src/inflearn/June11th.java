package inflearn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class June11th {	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();//배열복제하기
		Arrays.sort(tmp); //오른차순정렬
		for(int i=0;i<n;i++)
			if(arr[i] != tmp[i])//현재순서와 오름차순비교
				answer.add(i+1);//같지않다면 정답배열에 넣기
		return answer;		
	}
	public static void main(String[] args){
		June11th T = new June11th();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) 
			arr[i]=kb.nextInt();
		for(int x : T.solution(n, arr)) 
			System.out.print(x+" ");
	}
}