package problemSolving;

import java.util.*;
class Permutation {
	static int[] pm;
	static int n, m;
	public void DFS(int L){
		if(L==m){ //������ �ε����� ������
			for(int x : pm) //�迭�� �ִ°� �ϳ��� ������
			System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=1; i<=n; i++){
				pm[L]=i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args){
		Permutation T = new Permutation();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt(); //���� ����
		m=kb.nextInt(); //�ε���
		pm=new int[m];
		T.DFS(0);
	}
}