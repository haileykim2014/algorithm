package problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj2493 {

	static class Tower{
		int idx, height;
		
		public Tower(int idx, int height) {
			this.idx = idx;
			this.height = height;
		}
	}
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Tower> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i<=n ; i++) {
			int tower = Integer.parseInt(st.nextToken());
			if(stack.isEmpty()) {
				System.out.println("0 ");
				stack.push(new Tower(i,tower));
			}else {
				while(true) {
					if(stack.isEmpty()) {
						System.out.print("0 ");
						stack.push(new Tower(i,tower));
						break;
					}
					else {
						if(stack.peek().height > tower) {
							System.out.print(stack.peek().idx +" ");
							stack.push(new Tower(i,tower));
							break;
						}else {
							stack.pop();
						}
					}
				}
			}
		}

	}

}
