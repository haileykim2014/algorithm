package problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Boj2577 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int total = a * b * c;
		System.out.println("total : "+total);
		String totalString = String.valueOf(total);
		int[] arr = new int[100];
		for(int i = 0 ; i<totalString.length();i++) {
			arr[totalString.charAt(i)-'0']++;
			System.out.println("i : "+i +"¹øÂ° :" +totalString.charAt(i));
		}
		
	     for(int i =0;i<10;i++) {
	    	System.out.println(arr[i]);
	     }

	}

}
