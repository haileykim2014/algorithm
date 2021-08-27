package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {
	//해당 영역에서 기준값을 세우고 그 값을 기준으로 작은수와 큰수로 다시나누고 계속 나누다가 결국 파티션이 한개인경우가 되면 
	//모든값들이 정렬된다.
	private static void quickSort(int[] arr) {//정렬할 배열받기
		quickSort(arr,0,arr.length-1);//시작위치와 끝나는지점을 정해서 재귀함수호출
	}
	private static void quickSort(int[] arr,int start,int end) {
		int part2 = partition(arr,start,end);//오른쪽방 첫번째값
		if(start < part2-1) {
			quickSort(arr,start,part2-1);//오른쪽 파트시작점 바로전으로 조정		
		}
		if(part2<end) {//오른쪽파티션의 시작점이 마지막 배열방보다 작을때 
			quickSort(arr,part2,end);// 오른쪽파티션을 정렬한다
		}
	}
	public static int partition(int[] arr,int start,int end) {
		int pivot = arr[(start+end)/2];//중간지점계산
		while(start<=end) {
			while(arr[start]<pivot)start++; //기준값보다 작으면 계속넘어간다
			while(arr[end]>pivot)end--; //기준값보다 크면 계속넘어간다.
			if(start <= end) {
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	private static void swap(int[] arr,int start,int end) {
		int tmp = arr[start];//임시공간에 잔깐담기
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
