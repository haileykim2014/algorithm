package inflearn;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		  int temp = 0;
			for(int i = 0; i < arr.length; i++) {       // 1.
				for(int j= 1 ; j < arr.length-i; j++) { // 2. ���� Ž�����ʹ� ��������Ҵ� ���ص��ȴ� arr.length-i������ Ž��
					if(arr[j-1] > arr[j]) {             // 3. i, i+1��°�� ��

						temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp; //������ 1�� ó���ɶ� ���� ū ���� �迭 �������� ��ġ�Ѵ�.
					}
				}
			}	
	}
	
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = new int[] {3,6,41,2,4,1,5,743};
		bs.bubbleSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
