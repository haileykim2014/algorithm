package problemSolving;

import java.util.*;
class SubSet{
	static String answer="NO"; //�������� �ʴ´ٷ� �⺻answer ����
	static int n, total=0;//���� ����, ���ҵ��� ��
	boolean flag=false;//����
	public void DFS(int L, int sum, int[] arr){
		if(flag) return;//Yes�� �߰ߵǸ� ���� ��ʹ� �� ���Ͻ�Ű�� ���� ����
		if(sum>total/2) return; //�ٸ� ��θ� �ľ��ϵ��� return���� ����
		if(L==n){
			if((total-sum)==sum){
				answer="YES";
				flag=true;//���� ��ʹ� ���Ͻ�Ű��
			}	
		}
		else{//�� ������ ������. �������Ҹ� ����ϴ°�, ���ϴ°�
			DFS(L+1, sum+arr[L], arr); //������������ arr[L] ���Ҹ� ����Ѵ�
			DFS(L+1, sum, arr); //������������ arr[L] ���Ҹ� ��� ���Ѵ�
		}
	}
	public static void main(String[] args){
		SubSet T = new SubSet();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}