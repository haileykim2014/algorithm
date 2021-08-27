package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {
	//�ش� �������� ���ذ��� ����� �� ���� �������� �������� ū���� �ٽó����� ��� �����ٰ� �ᱹ ��Ƽ���� �Ѱ��ΰ�찡 �Ǹ� 
	//��簪���� ���ĵȴ�.
	private static void quickSort(int[] arr) {//������ �迭�ޱ�
		quickSort(arr,0,arr.length-1);//������ġ�� ������������ ���ؼ� ����Լ�ȣ��
	}
	private static void quickSort(int[] arr,int start,int end) {
		int part2 = partition(arr,start,end);//�����ʹ� ù��°��
		if(start < part2-1) {
			quickSort(arr,start,part2-1);//������ ��Ʈ������ �ٷ������� ����		
		}
		if(part2<end) {//��������Ƽ���� �������� ������ �迭�溸�� ������ 
			quickSort(arr,part2,end);// ��������Ƽ���� �����Ѵ�
		}
	}
	public static int partition(int[] arr,int start,int end) {
		int pivot = arr[(start+end)/2];//�߰��������
		while(start<=end) {
			while(arr[start]<pivot)start++; //���ذ����� ������ ��ӳѾ��
			while(arr[end]>pivot)end--; //���ذ����� ũ�� ��ӳѾ��.
			if(start <= end) {
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	private static void swap(int[] arr,int start,int end) {
		int tmp = arr[start];//�ӽð����� �ܱ���
		arr[start]=arr[end];
		arr[end]=tmp;
	}
	private static void printArray(int[] arr) {
		for(int data:arr) {
			System.out.print(data+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		quickSort(arr);
		printArray(arr);
	}
}
