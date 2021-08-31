package inflearn;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		  int temp = 0;
			for(int i = 0; i < arr.length; i++) {       // 1.
				for(int j= 1 ; j < arr.length-i; j++) { // 2. 다음 탐색부터는 마지막요소는 안해도된다 arr.length-i까지만 탐색
					if(arr[j-1] > arr[j]) {             // 3. i, i+1번째를 비교

						temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp; //과정이 1번 처리될때 가장 큰 수가 배열 마지막에 위치한다.
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
