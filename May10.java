package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class May10 {
	
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        long[][] dp= new long[n+1][10];
        
        for(int i=1;i<=9;i++){
            dp[1][i] = 1;            
        }
        for(int i=2;i<=n;i++){
            dp[i][0] = dp[i-1][1];
            for(int j=1;j<=9;j++){
                dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%100000000;
            }
        }
        for(int i=0;i<10;i++)
            sum += dp[n][i];
        System.out.println(sum%100000000);
    }
}

