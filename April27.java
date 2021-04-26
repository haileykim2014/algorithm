package testPackage;

import java.util.Scanner;

public class April27 {
	public int solution(int n, int[][] arr){
		int answer=0, max=0;
		for(int i=1; i<=n; i++){//i번째학생
			int cnt=0;//겹친수
			for(int j=1; j<=n; j++){//j번째학생
				for(int k=1; k<=5; k++){//학년
					if(arr[i][k]==arr[j][k]){//i번쨰학생과 j번째학생비교
						cnt++;
						break;
					}
				}
			}
			if(cnt>max){
				max=cnt;
				answer=i;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		April27 T = new April27();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] arr=new int[n+1][6];
		for(int i=1; i<=n; i++){
			for(int j=1; j<=5; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}

