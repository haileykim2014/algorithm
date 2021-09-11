package problemSolving;

import java.util.Arrays;

public class 제일작은수제거 {
	public int[] solution(int[] arr) {
		if(arr.length==1) {
			int[] answer = {-1};
			return answer;
		}
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		int[] answer = new int[arr.length-1];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(min==arr[i]) {
				continue;
			}
			answer[index++] = arr[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		제일작은수제거 t = new 제일작은수제거();
		int[] arr = {4,3,2,1};
		arr = t.solution(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
