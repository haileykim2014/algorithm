package inflearn;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		
		int temp = 0; //ÀÓ½Ãº¸°ü¼Ò
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {//회전을 할 수록 범위가 줄어든다
				if(arr[j-1]>arr[j]) {
					
					arr[temp] = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = arr[temp];
					
				}
			}
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		BubbleSort bs = new BubbleSort();
		
		int[] arr = new int[] {1,5,2,35,14,22,11};
		bs.bubbleSort(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

}
