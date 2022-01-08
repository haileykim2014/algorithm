package problemSolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Boj1406 {
	public static void main(String[] args) throws IOException{
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	        String[] str = br.readLine().split("");
	        java.util.LinkedList<Character> list = new java.util.LinkedList<Character>();
	        ListIterator<Character> iter = list.listIterator();

	        int len = str.length; 
	        for (int i = 0; i < len; i++) iter.add(str[i].charAt(0));

	        int N = Integer.parseInt(br.readLine());

	        while (N-- > 0) {
	            char[] input = br.readLine().toCharArray();

	            switch (input[0]) {
	                case 'L':
	                    if(iter.hasPrevious())
	                        iter.previous();
	                    break;
	                case 'D':
	                    if(iter.hasNext())
	                        iter.next();
	                    break;
	                case 'B':
	                    if(iter.hasPrevious()){
	                        iter.previous();
	                        iter.remove();
	                    }
	                    break;
	                default:
	                    iter.add(input[2]);
	                    break;
	            }
	        }
	        for(char c : list){
	            wr.write(c);
	        }
	        wr.flush();
	}
}
