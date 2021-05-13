package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class May13 {

	static int[] dy;
	public static int solution(int n) {
	dy[1] = 1;
	dy[2] = 2;
	for(int i=3; i<=n;i++) {
		dy[i] = dy[i-1] + dy[i-2];
	}
	return dy[n];
	}
	
	public static void main(String[] args){
		May13 T = new May13();

		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		dy=new int[n+1];
		System.out.print(T.solution(n));
	}
}

