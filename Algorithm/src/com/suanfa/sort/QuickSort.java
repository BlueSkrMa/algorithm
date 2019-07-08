package com.suanfa.sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
		maxInteger(arr, 0, arr.length-1,7);
		System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr,int low,int high) {
		if(low>high) {
			return;
		}
		int i=low,j=high;
		int temp=arr[low];
		while(i<j) {
			while(temp<=arr[j]&&i<j) j--;
			while(temp>=arr[i]&&i<j)i++;
			if(i<j) {
				int t=arr[j];
				arr[j]=arr[i];
				arr[i]=t;
			}
		}
		arr[low]=arr[i];
		arr[i]=temp;
		quickSort(arr, low, j-1);
		quickSort(arr, j+1, high);
	}
	//快速排序找到第n大的数
	public static void maxInteger(int[] arr,int low,int high,int num) {
		if(low>high)return ;
		int i=low,j=high;
		int temp=arr[low];
		while(i<j) {
			while(arr[j]>=temp&&i<j)j--;
			while(arr[i]<=temp&&i<j)i++;
			if(i<j) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			
		}
		arr[low]=arr[i];
		arr[i]=temp;
		if(i==(num-1))System.out.println("第n大的数为："+arr[i]);
		maxInteger(arr, low, j-1,num);
		maxInteger(arr, j+1, high,num);
	}
}
