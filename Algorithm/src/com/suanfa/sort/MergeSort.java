package com.suanfa.sort;

import java.util.Arrays;

import sun.security.provider.VerificationProvider;

/**
 * 归并排序
 */
public class MergeSort {
	public static void main(String[] args) {
		int a[]={111,100,12,4,1,101,55,65,33,35,22};
		new MergeSort().mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	private void merge(int a[], int low, int mid, int high) {
		int temp[]=new int[a.length];
		int i=low;
		int j=mid+1;
		int k=low;
		while(low<=mid&&j<=high) {
			if(a[low]<a[j]) {
				temp[i++]=a[low++];
			}else {
				temp[i++]=a[j++];
			}
		}
		while(low<=mid)temp[i++]=a[low++];
		while(j<=high)temp[i++]=a[j++];
		while(k<=high)a[k]=temp[k++];
	}

	public void mergeSort(int[] a, int start, int end) {
		int mid=(start+end)/2;
		if(start<end) {
			mergeSort(a, start, mid);
			mergeSort(a, mid+1,end);
			merge(a, start, mid, end);
		}
	}
}
