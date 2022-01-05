package problemSolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Boj1919 {
	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int first = Integer.parseInt(br.readLine());
	int[] arr = new int[first];
	StringTokenizer st = new StringTokenizer(br.readLine());
	for(int i=0;i<first;i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	int x = Integer.parseInt(br.readLine());
	Arrays.sort(arr);
	
	int start = 0;
	int end = first -1;
	int cnt = 0;
	int sum;
	while(start<end) {
		sum= arr[start]+arr[end];
		if(sum==x)cnt++;
		if(sum<=x)start++;
		else end--;
	}
	System.out.println(cnt);
    }
}
