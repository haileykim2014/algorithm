package problemSolving;

import java.util.*;
class 이분검색 {
	public int solution(int n, int m, int[] arr){
		int answer=0;
		Arrays.sort(arr);
		int lt=0, rt=n-1; //맨앞쪽, 뒤쪽
		while(lt<=rt){ 
			int mid=(lt+rt)/2; // 3 = (0+7)/2
			if(arr[mid]==m){
				answer=mid+1;
				break;
			}//arr[mid]값이 찾으려는 값(32)보다 크다면 arr[mid]전 까지만 다시 찾으면된다.
			if(arr[mid]>m) rt=mid-1; //rt값이 맨 뒤였지만, 이제는 mid보다 작아야하므로 mid-1, 검색범위가 절반줄어든다
			else lt=mid+1; //내가 찾고자하는게 더 크다면(81이라면) 위쪽범위를 찾아야한다.
		}
		return answer;
	}
	public static void main(String[] args){
		이분검색 T = new 이분검색();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}