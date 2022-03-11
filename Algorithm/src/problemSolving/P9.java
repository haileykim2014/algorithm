package problemSolving;

import java.util.*;
class P9 {
	public int count(int[] arr, int capacity){ // capacity : dvd 1�� �뷮���������� arr�� ���� �� �������ճ�
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
			else lt=mid+1; //mid�� �����������Ѵ�.
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
//mid �� ������ �䱸�ϴ� ���ǿ� �����Ѱ�
//�ּҰ� : mid���� ū ���ں��ʿ�x
//�迭�� �������������̾����
//������ �� 45 �� 9(�ϳ��� ������)���̿� �����ִ�.