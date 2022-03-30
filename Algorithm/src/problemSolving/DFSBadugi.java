package problemSolving;

import java.util.Scanner;

public class DFSBadugi {
	static int answer = Integer.MIN_VALUE,n,max;//�ִ����������, ���� ����,�ִ�ð�
	public void DFS(int L,int score, int time,int[] scoreArr,int[] timeAree) {
		if(time>max)//�ִ�ð� �ʰ��ϸ� ����
			return;
		if(L==n) {//������ ���ܳ����� ������
			answer = Math.max(answer, score); //���� ū ���� ���ϱ�
		}
		else {//������������
			DFS(L+1,score+scoreArr[L],time+timeAree[L], scoreArr, timeAree); //���� ��忡�� �߰����� Ǯ��
			DFS(L+1,score,time, scoreArr, timeAree); // ������忡�� �߰����� ��Ǯ��
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
		t.DFS(0,0,0, score, time);//����,����,�ð�,�����迭,�ð��迭
		System.out.println(answer); //�ִ����� ���
	}
}
