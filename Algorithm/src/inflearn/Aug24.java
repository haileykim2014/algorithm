package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Aug24 {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("손오공","1682"); //이름과 넘버넣어서 객체생성
		Student st2 = new Student("저팔계","1772"); //이름과 넘버넣어서 객체생성
		Student st3 = new Student("사오정","1813"); //이름과 넘버넣어서 객체생성
		
		ArrayList <Student>list = new ArrayList<Student>();// Student자료형넣기
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		//제대로들어갔는지확인
		for(Student stu :list) {
			//arraylist를 처음부터 끝까지순회
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
			
		}
		//사용자로부터 키입력받기
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("계속 검색을 하고싶으시면y, 종료하고싶으시면 n");
			String input = scan.next();

			if(input.equals("y")) {
				System.out.println("검색을 시작합니다");
			}
			else if(input.equals("n")) {
				break;//n이면 while물 탈출
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
