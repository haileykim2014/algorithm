package inflearn;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		
		int temp = 0; //임시보관소
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
			}
			
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		BubbleSort bs = new BubbleSort();
		
		int[] arr = new int[] {10,6,2,35,14,23,11};
		arr = bs.bubbleSort(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

}
