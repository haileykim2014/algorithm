package problemSolving;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Boj7576 {
	private static int[] dx = { -1, 0, 1, 0 };
	private static int[] dy = { 0, 1, 0, -1 };
	private static int colSize, rowSize, answer;
	private static Queue<Pair> queue;
	private static int[][] box;
	private static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] sizeInput = reader.readLine().split(" ");
		colSize = Integer.parseInt(sizeInput[0]);
		rowSize = Integer.parseInt(sizeInput[1]);
		queue = new LinkedList();
		box = new int[rowSize][colSize];
		visited = new boolean[rowSize][colSize];
		for (int row = 0; row < rowSize; row++) {
			String[] data = reader.readLine().split(" ");
			for (int col = 0; col < colSize; col++) {
				box[row][col] = Integer.parseInt(data[col]);
// ���� ���� ť�� ����
				if (box[row][col] == 1) {
					queue.add(new Pair(row, col));
					visited[row][col] = true;
				}
			}
		}
		bfs();
		findAnswer();
// �丶�䰡 ��� ���� ���
		if (answer != -1)
			System.out.println(answer - 1);
// �丶�䰡 ��� ������ ���
		else {
			System.out.println(answer);
		}
	}

	private static void bfs() {
		while (!queue.isEmpty()) {
			Pair pair = queue.poll();
			int curX = pair.x;
			int curY = pair.y;
// ��, ��, ��, �� ��� Ž��
			for (int direction = 0; direction < 4; direction++) {
				int nextX = curX + dx[direction];
				int nextY = curY + dy[direction];
				if (0 <= nextX && nextX < rowSize && 0 <= nextY && nextY < colSize) {
					if (!visited[nextX][nextY] && box[nextX][nextY] == 0) {
						visited[nextX][nextY] = true;
						box[nextX][nextY] = box[curX][curY] + 1;
						queue.add(new Pair(nextX, nextY));
					}
				}
			}
		}
	}

	private static void findAnswer() {
		for (int row = 0; row < rowSize; row++) {
			for (int col = 0; col < colSize; col++) {
				if (box[row][col] == 0) {
					answer = -1;
					return;
				}
				answer = Math.max(answer, box[row][col]);
			}
		}
	}
}
