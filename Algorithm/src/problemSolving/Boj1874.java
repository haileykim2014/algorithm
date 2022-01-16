package problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10773 {
	
	public static int[] stack;
	public static int size = 0;
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;

		int N = Integer.parseInt(br.readLine());
 
		stack = new int[N];//주문시 push된 값을 담을 배열
		
		while (N-- > 0) {
			int order = Integer.parseInt(br.readLine());
 
			if(order == 0) {
				pop();
			}
			else {
				push(order);
			}
		}
		for(int i : stack) {
			result += i;
		}
		
		System.out.println(result);
	}
 
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
	
	public static int pop() {

			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;	
	}
	
	public static void all() {
		for(int i : stack) {
		 System.out.print(stack[i]+",");
		}
	}
	
}
