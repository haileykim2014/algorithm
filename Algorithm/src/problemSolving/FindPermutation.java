package problemSolving;

import java.util.Scanner;

public class FindPermutation {
	static int[] pm, ch, arr;
	static int n, m; //�ڿ��� ���� , �̾ƾ��� ����
	public void DFS(int L){
		if(L==m){ //�̾Ƴ����� �ܰ踦 �� ���� ���
			for(int x : pm) System.out.print(x+" "); //������ ��� ���� �ϳ��� ���
			System.out.println();
		}
		else{ //���� �� ������ �� �����ʾ�����
			for(int i=0; i<n; i++){ //�־��� �ڿ��� ������ŭ �ݺ�
				if(ch[i]==0){ //�湮���� �ʾҴٸ� ,�ߺ�����
					ch[i]=1; //�湮üũ
					pm[L]=arr[i]; //������ i��° ���ڳֱ�
					DFS(L+1); //���� ����
					ch[i]=0; //�湮���� -> �������� ��ġ�� ���ƿ����� 
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
