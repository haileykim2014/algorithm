package problemSolving;

import java.util.*;

class 그래프최단거리 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;

	public void BFS(int v) {
		ch[v] = 1;//시작
		dis[v] = 0;//0단계
		Queue<Integer> queue = new java.util.LinkedList<>(); //큐 새로 만들기, 순서를위한것
		queue.offer(v);//시작점 넣기
		while (!queue.isEmpty()) { //큐가 빌때까지
			int cv = queue.poll();//현재 정점꺼내기
			for (int nv : graph.get(cv)) {//연결정보 하나씩 꺼내기
				if (ch[nv] == 0) {//방문안했다면
					ch[nv] = 1; //방문체크
					queue.offer(nv); //현재 조회한 정보 넣기
					dis[nv] = dis[cv] + 1; //현재까지 깊이 +1
				}
			}
		}
	}

	public static void main(String[] args) {
		그래프최단거리 T = new 그래프최단거리();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1]; //인덱스 번호 1번부터하기위해 n+1
		dis = new int[n + 1];
		for (int i = 0; i < m; i++) { //인접리스트 만들기
			int a = scan.nextInt(); //arraylist 순서
			int b = scan.nextInt(); //넣을 값
			graph.get(a).add(b); //연결정보 넣기, a번째 arrayList 에 b 넣기
		}
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]); //노드 : 길이(깊이)
		}
	}
}