package problemSolving;

import java.util.*;
class Tree {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v){
		if(v==n) answer++; //�� ������ ������ answer++
		else{
			for(int i=1; i<=n; i++){
				if(graph[v][i]==1 && ch[i]==0){ //������ �����ϰ�(���� ��ġ�� �°�) & �湮�� ���� ���ٸ�
					ch[i]=1; //���� �湮�����ϱ� üũ
					DFS(i); //�ش� ����� child���� �ľ�
					ch[i]=0; //�ǵ��� �������� ��湮 üũ (�θ���� ���ư��� �ٽ� i�� üũ�� �� �ֱ����Ѱ� 
				}
			}
		}
	}
	
	public static void main(String[] args){
		Tree T = new Tree();
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt(); //���� ��
		m=scan.nextInt(); //���� ��
		graph=new int[n+1][n+1];//���� ��ġ����
		ch=new int[n+1]; //�湮 ����
		for(int i=0; i<m; i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			graph[a][b]=1; //�����׸���
		}
		ch[1]=1; //������ �湮üũ
		T.DFS(1);
		System.out.println(answer);
	}	
}