package problemSolving;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1874 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 수열의 갯수
		int index = 0;//오름차순으로 push하기 위한 변수
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder(); 
		
		while(n-->0) {
			
			int num = Integer.parseInt(br.readLine());
			
			if(num>index) {//입력받은 숫자가 인덱스보다 클떄
				for(int i=1;i<=num;i++) {
					stack.push(i);//입력받은 숫자 넣기
					sb.append("+").append("\n");
				}
				index = num; //입력받은 숫자 넣은 후 index 업데이트
				
			}else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			stack.pop(); //위에있는 값꺼내기
			sb.append("-").append("\n");
		}
		System.out.println(sb);
		}    
}