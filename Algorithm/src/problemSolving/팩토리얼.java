package problemSolving;

public class ���丮�� {
public int DFS(int n) {
	if(n==1)
		return 1;
	else return n*DFS(n-1);
	
	}

	public static void main(String[] args) {
		���丮�� t = new ���丮��();
		System.out.println(t.DFS(5));
	}
}
