package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Aug24 {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("�տ���","1682"); //�̸��� �ѹ��־ ��ü����
		Student st2 = new Student("���Ȱ�","1772"); //�̸��� �ѹ��־ ��ü����
		Student st3 = new Student("�����","1813"); //�̸��� �ѹ��־ ��ü����
		
		ArrayList <Student>list = new ArrayList<Student>();// Student�ڷ����ֱ�
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		//����ε�����Ȯ��
		for(Student stu :list) {
			//arraylist�� ó������ ��������ȸ
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
			
		}
		//����ڷκ��� Ű�Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("��� �˻��� �ϰ�����ø�y, �����ϰ�����ø� n");
			String input = scan.next();

			if(input.equals("y")) {
				System.out.println("�˻��� �����մϴ�");
			}
			else if(input.equals("n")) {
				break;//n�̸� while�� Ż��
			}
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
