package com.suanfa.sort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] arr = a();
		long l1 = System.currentTimeMillis();
		//sortA(arr);
		System.out.println(Arrays.toString(sort(arr)));
		long l = System.currentTimeMillis();
		System.out.println(1);
		System.out.println(l-l1);
		System.out.println();
		System.out.println(Arrays.toString(sortA(arr)));
		
	}
	public static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value=arr[i];
			int j=i-1;
			for (; j>=0; j--) {
				if(arr[j]>value) {
					arr[j+1]=arr[j];
				}else {
					break;
				}
			}
			arr[j+1] = value;
		}
		return arr;
	}
	public static int[] sortA(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] a() {
		int[] arr=new int[20000];
		int i=0;
		while(i<20000) {
			int num=(int) Math.floor(Math.random()*100000);
			arr[i]=num;
			i++;
		}
		return arr;
	}
}

