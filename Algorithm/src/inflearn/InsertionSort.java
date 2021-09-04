package inflearn;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {10,2,6,4,3,7,5}; 
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i]; //1회시 기준이 될 arr[1]부터시작
			int prev = i-1; // 기준의 앞의 원소
			
			while(prev >= 0 && arr[prev]>temp) { //비교할 대상이 0보다 크고 기준보다 클때
				arr[prev+1] = arr[prev];//기준의 앞숫자와 기준으르 바꾼다. 오른쪽으로 밀어내기
				prev--; //기준의 앞번호
			}
			arr[prev+1] = temp; //기준값 저장
		}
		printArr(arr);
	}
	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
