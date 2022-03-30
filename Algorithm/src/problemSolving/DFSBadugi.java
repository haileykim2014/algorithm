package problemSolving;

import java.util.Scanner;

public class DFSBadugi {
	static int answer = Integer.MIN_VALUE,n,max;//최대점수결과값, 원소 갯수,최대시간
	public void DFS(int L,int score, int time,int[] scoreArr,int[] timeAree) {
		if(time>max)//최대시간 초과하면 리턴
			return;
		if(L==n) {//마지막 말단노드까지 갔을때
			answer = Math.max(answer, score); //가장 큰 점수 구하기
		}
		else {//다음레벨측정
			DFS(L+1,score+scoreArr[L],time+timeAree[L], scoreArr, timeAree); //다음 노드에서 추가문제 풀기
			DFS(L+1,score,time, scoreArr, timeAree); // 다음노드에서 추가문제 안풀기
		}
	}
	public static void main(String[] args) {
		DFSBadugi t = new DFSBadugi();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();//5
		max = scan.nextInt();//20
		int[] score = new int[n];
		int[] time = new int[n];
		for(int i=0;i<n;i++) {
			score[i] = scan.nextInt();
			time[i] = scan.nextInt();
		}
		t.DFS(0,0,0, score, time);//레벨,점수,시간,점수배열,시간배열
		System.out.println(answer); //최대점수 출력
	}
}
