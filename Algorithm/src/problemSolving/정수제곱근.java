package problemSolving;

public class ���������� {
	public long solution(long n) {
		//������ ���ϱ�
		long sqrt = (long) Math.sqrt(n);
		//�־��� ���� �ŵ��������Ѱ��� ��ġ�ϴ��� Ȯ��
		if(n == Math.pow(sqrt, 2)) {
			//������+1�� ���� �ŵ��������ϱ�
			return (long)Math.pow(sqrt+1,2);
		}
		else {//�ƴ϶�� -1����
			return -1;
		}
	}
	
	public static void main(String[] args) {

		���������� t = new ����������();
		long n = 121;
		System.out.println(t.solution(n));
	}

}
