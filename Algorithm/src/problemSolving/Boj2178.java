package problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj2178 {

	static int n;
	static int m;
	static int[][] map;
	static boolean[][] visited;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		n = Integer.parseInt(st.nextToken());// ��
		m = Integer.parseInt(st.nextToken());// ��
 
		map = new int[n][m]; // �̷� ����
		visited = new boolean[n][m]; // �湮 ����
		visited[0][0] = true;
 
		for (int i = 0; i < n; i++) { // ���� ����
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
 
		search(0, 0);
		System.out.println(map[n - 1][m - 1]);
	}
 
	public static void search(int x, int y) {
		Queue<int[]> queue = new java.util.LinkedList<int[]>();
		queue.add(new int[] { x, y });
 
		// �̵� �� �� �ִ� ���� ��, ��������
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
 
		while (!queue.isEmpty()) { // ť�� �� ��ǥ Ž���� ��� ���� ������ �ݺ�
			int[] xy = queue.poll();
 
			for (int i = 0; i < 4; i++) { // ��, ��, ��, �� Ž��
				int nextX = xy[0] + dx[i];
				int nextY = xy[1] + dy[i];
 
				// ���� ������ �̷θ� ����ų�, ���̰ų�, �̹� Ž���� �� ��ǥ�̸� ����
				if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || visited[nextX][nextY]
						|| map[nextX][nextY] == 0) {
					continue;
				}
 
				// ���� Ž�� ������ ť�� �߰�
				queue.add(new int[] { nextX, nextY });
 
				// ���� Ž�� ���� Ž��ó��
				visited[nextX][nextY] = true;
 
				// ���� Ž�� ������ ����� ���� ��ǥ + 1 �� ����
				map[nextX][nextY] = map[xy[0]][xy[1]] + 1;
			}
		}
	}
}
