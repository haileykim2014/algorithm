package problemSolving;

import java.util.Scanner;

public class Boj2752 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();			
		}
		

			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
	}

}
