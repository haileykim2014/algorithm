package problemSolving;

public class ÆÑÅä¸®¾ó {
public int DFS(int n) {
	if(n==1)
		return 1;
	else return n*DFS(n-1);
	
	}

	public static void main(String[] args) {
		ÆÑÅä¸®¾ó t = new ÆÑÅä¸®¾ó();
		System.out.println(t.DFS(5));
	}
}
