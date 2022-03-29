package problemSolving;

import java.util.*;

class �׷����ִܰŸ� {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;

	public void BFS(int v) {
		ch[v] = 1;//����
		dis[v] = 0;//0�ܰ�
		Queue<Integer> queue = new java.util.LinkedList<>(); //ť ���� �����, ���������Ѱ�
		queue.offer(v);//������ �ֱ�
		while (!queue.isEmpty()) { //ť�� ��������
			int cv = queue.poll();//���� ����������
			for (int nv : graph.get(cv)) {//�������� �ϳ��� ������
				if (ch[nv] == 0) {//�湮���ߴٸ�
					ch[nv] = 1; //�湮üũ
					queue.offer(nv); //���� ��ȸ�� ���� �ֱ�
					dis[nv] = dis[cv] + 1; //������� ���� +1
				}
			}
		}
	}

	public static void main(String[] args) {
		�׷����ִܰŸ� T = new �׷����ִܰŸ�();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1]; //�ε��� ��ȣ 1�������ϱ����� n+1
		dis = new int[n + 1];
		for (int i = 0; i < m; i++) { //��������Ʈ �����
			int a = scan.nextInt(); //arraylist ����
			int b = scan.nextInt(); //���� ��
			graph.get(a).add(b); //�������� �ֱ�, a��° arrayList �� b �ֱ�
		}
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]); //��� : ����(����)
		}
	}
}