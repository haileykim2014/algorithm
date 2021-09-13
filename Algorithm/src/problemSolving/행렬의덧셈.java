package problemSolving;

import java.util.Arrays;

public class Çà·ÄÀÇµ¡¼À {
	public static int[][] solution(int[][] arr1,int[][] arr2){
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				
				answer[i][j] = arr1[i][j]+arr2[i][j];
				
			}
		}
		
		return answer;
	}
	
	public static void main(String[]args) {
		Çà·ÄÀÇµ¡¼À t = new Çà·ÄÀÇµ¡¼À();
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int[][] arr3 = t.solution(arr1, arr2);
		
		System.out.println(Arrays.deepToString(arr3));
	}
}
