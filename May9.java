package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class May9 {
	public ArrayList<Integer> solution(int n,int k,int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<k-1;i++) {//���� k-1���� HashMap�� ���
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		int lt =0;
		for(int rt=k-1; rt<n;rt++) {
			hm.put(arr[rt], hm.getOrDefault(arr[rt], 0)+1);
			answer.add(hm.size());
			hm.put(arr[lt],hm.get(arr[lt])-1);
			if(hm.get(arr[lt])==0)
				hm.remove(arr[lt]);
			lt++;
		}
		return answer;
	}

	public static void main(String[] args){
		May9 T = new May9();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr =new int[n];//�ϼ�
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		for(int x:T.solution(n,k,arr))
			System.out.println(x+"");
		//�ִٸ� -1
		//x���Ű�� �����ϴ� ? ����������������, �Ǵ� x���� Ű�ǰ��� 0�̸� 
	}
}