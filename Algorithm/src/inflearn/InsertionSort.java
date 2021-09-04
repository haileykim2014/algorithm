package inflearn;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {10,2,6,4,3,7,5}; 
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i]; //1ȸ�� ������ �� arr[1]���ͽ���
			int prev = i-1; // ������ ���� ����
			
			while(prev >= 0 && arr[prev]>temp) { //���� ����� 0���� ũ�� ���غ��� Ŭ��
				arr[prev+1] = arr[prev];//������ �ռ��ڿ� �������� �ٲ۴�. ���������� �о��
				prev--; //������ �չ�ȣ
			}
			arr[prev+1] = temp; //���ذ� ����
		}
		printArr(arr);
	}
	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
