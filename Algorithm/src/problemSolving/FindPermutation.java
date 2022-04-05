package problemSolving;

import java.util.Scanner;

public class FindPermutation {
	static int[] pm, ch, arr;
	static int n, m; //자연수 갯수 , 뽑아야할 갯수
	public void DFS(int L){
		if(L==m){ //뽑아내야할 단계를 다 돌은 경우
			for(int x : pm) System.out.print(x+" "); //순열에 담긴 숫자 하나씩 출력
			System.out.println();
		}
		else{ //아직 다 순열을 다 뽑지않았을때
			for(int i=0; i<n; i++){ //주어진 자연수 갯수만큼 반복
				if(ch[i]==0){ //방문하지 않았다면 ,중복피함
					ch[i]=1; //방문체크
					pm[L]=arr[i]; //순열에 i번째 숫자넣기
					DFS(L+1); //다음 레벨
					ch[i]=0; //방문해제 -> 다음레벨 마치고 돌아왔을때 
				}
			}
		}
	}
	public static void main(String[] args){
		FindPermutation T = new FindPermutation();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		arr=new int[n]; //주어진 자연수 담을 배열
		for(int i=0; i<n; i++) 
			arr[i]=kb.nextInt(); //주어진 자연수 넣기
		ch=new int[n]; //방문 확인용
		pm=new int[m]; //수열담을 배열
		T.DFS(0);
	}
}
