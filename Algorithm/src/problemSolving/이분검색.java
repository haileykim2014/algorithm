package problemSolving;

import java.util.*;
class �̺а˻� {
	public int solution(int n, int m, int[] arr){
		int answer=0;
		Arrays.sort(arr);
		int lt=0, rt=n-1; //�Ǿ���, ����
		while(lt<=rt){ 
			int mid=(lt+rt)/2; // 3 = (0+7)/2
			if(arr[mid]==m){
				answer=mid+1;
				break;
			}//arr[mid]���� ã������ ��(32)���� ũ�ٸ� arr[mid]�� ������ �ٽ� ã����ȴ�.
			if(arr[mid]>m) rt=mid-1; //rt���� �� �ڿ�����, ������ mid���� �۾ƾ��ϹǷ� mid-1, �˻������� �����پ���
			else lt=mid+1; //���� ã�����ϴ°� �� ũ�ٸ�(81�̶��) ���ʹ����� ã�ƾ��Ѵ�.
		}
		return answer;
	}
	public static void main(String[] args){
		�̺а˻� T = new �̺а˻�();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}