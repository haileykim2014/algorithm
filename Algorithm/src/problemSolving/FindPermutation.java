package problemSolving;

import java.util.Scanner;

public class FindPermutation {
	static int[] pm, ch, arr;
	static int n, m;
	public void DFS(int L){
		if(L==m){
			for(int x : pm) System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=0; i<n; i++){
				if(ch[i]==0){
					ch[i]=1;
					pm[L]=arr[i];
					DFS(L+1);
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args){
		FindPermutation T = new FindPermutation();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		arr=new int[n]; //�־��� �ڿ��� ���� �迭
		for(int i=0; i<n; i++) 
			arr[i]=kb.nextInt(); //�־��� �ڿ��� �ֱ�
		ch=new int[n]; //�湮 Ȯ�ο�
		pm=new int[m]; //�������� �迭
		T.DFS(0);
	}
}
