package problemSolving;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj1874 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // ������ ����
		int index = 0;//������������ push�ϱ� ���� ����
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder(); 
		
		while(n-->0) {
			
			int num = Integer.parseInt(br.readLine());
			
			if(num>index) {//�Է¹��� ���ڰ� �ε������� Ŭ��
				for(int i=1;i<=num;i++) {
					stack.push(i);//�Է¹��� ���� �ֱ�
					sb.append("+").append("\n");
				}
				index = num; //�Է¹��� ���� ���� �� index ������Ʈ
				
			}else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			stack.pop(); //�����ִ� ��������
			sb.append("-").append("\n");
		}
		System.out.println(sb);
		}    
}