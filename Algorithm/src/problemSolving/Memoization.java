package problemSolving;

import java.util.*;
class Memoization{
	int[][] dy=new int[35][35];
	public int DFS(int n, int r){//n�� r�� ,n���� r�� �̴´�.
		if(dy[n][r]>0) //n��r���� ���� �ִٸ�, 
			return dy[n][r]; //�̸� ���� �� ����
		if(n==r || r==0) return 1; //���� �ϴ�
		else return dy[n][r]=DFS(n-1, r-1)+DFS(n-1, r); 
		//n���� r���� �̴´� = n-1���� r-1���� �̱� + n-1���� r���̱�
	}
	public static void main(String[] args){
		Memoization T = new Memoization();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt(); //n����
		int r=kb.nextInt(); //r���� �̴´�
		System.out.println(T.DFS(n, r));
	}
}