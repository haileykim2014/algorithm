package problemSolving;

import java.util.*;
class P9 {
	public int count(int[] arr, int capacity){ // capacity : dvd 1장 용량으로했을때 arr의 값을 다 담을수잇나
		int cnt=1 ;
		int sum=0;
		for(int x : arr){
			if(sum+x>capacity){
				cnt++;
				sum=x;
			}
			else sum+=x;
		}
		return cnt;
	}

	public int solution(int n, int m, int[] arr){
		int answer=0;
		int lt=Arrays.stream(arr).max().getAsInt();
		int rt=Arrays.stream(arr).sum();
		while(lt<=rt){ 
			int mid=(lt+rt)/2;
			if(count(arr, mid)<=m){
				answer=mid;
				rt=mid-1;
			}
			else lt=mid+1; //mid의 뒤쪽을봐야한다.
		}
		return answer;
	}
	public static void main(String[] args){
		P9 T = new P9();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
//mid 가 문제가 요구하는 조건에 가능한가
//최소값 : mid보다 큰 숫자볼필요x
//배열이 오름차순정렬이어야함
//다합한 값 45 와 9(하나만 넣을때)사이에 답이있다.