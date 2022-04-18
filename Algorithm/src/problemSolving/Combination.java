package problemSolving;

import java.util.*;
class Combination{
	static int[] combi;
	static int n, m;
	public void DFS(int L, int s){
		if(L==m){//������ �ϼ�������
			for(int x : combi) 
				System.out.print(x+" ");
				System.out.println();
		}
		else{//������ ���鶧
			for(int i=s; i<=n; i++){
				combi[L]=i; //������ �ε������ϴ� �迭�� �հ踦 ����
				DFS(L+1, i+1); //���� ����, �����հ�
			}
		}
	}
	public static void main(String[] args){
		Combination T = new Combination();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		combi=new int[m];
		T.DFS(0, 1);
	}
}