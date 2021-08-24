package inflearn;

public class Student {
	
	private String name;
	private String no;
	
	
	public Student(String name, String no) {//생성자 네임과 넘버를받아서 초기화
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	

}
