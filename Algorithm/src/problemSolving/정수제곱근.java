package problemSolving;

public class 정수제곱근 {
	public long solution(long n) {
		//제곱근 구하기
		long sqrt = (long) Math.sqrt(n);
		//주어진 값과 거듭제곱구한값이 일치하는지 확인
		if(n == Math.pow(sqrt, 2)) {
			//제곱근+1한 값의 거듭제곱구하기
			return (long)Math.pow(sqrt+1,2);
		}
		else {//아니라면 -1리턴
			return -1;
		}
	}
	
	public static void main(String[] args) {

		정수제곱근 t = new 정수제곱근();
		long n = 121;
		System.out.println(t.solution(n));
	}

}
