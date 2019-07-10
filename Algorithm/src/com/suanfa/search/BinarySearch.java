package com.suanfa.search;

import sun.security.provider.MD5;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 6, 7, 11, 13, 14, 16, 16, 16 };
		boolean search = search(arr, 0, arr.length - 1, 19);
		System.out.println(search);
		int preSearch = finalSearch(arr, 0, arr.length - 1, 5);
		System.out.println(preSearch);
	}

	// 普通二分查找
	public static boolean search(int[] arr, int low, int high, int value) {
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (arr[mid] == value) {
				return true;
			} else if (arr[mid] > value) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

	// 查找第一个值等于给定值的元素
	public static int preSearch(int[] a, int low, int high, int value) {

		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (a[mid] > value) {
				high = mid - 1;
			} else if (a[mid] < value) {
				low = mid + 1;
			} else {
				if (mid == 0 || a[mid - 1] != value)
					return mid;
				else
					high = mid - 1;
			}
		}
		return -1;
	}

	// 查找最后一个值等于给定值的元素
	public static int finalSearch(int[] a, int low, int high, int value) {
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (a[mid] >= value) {
				if(mid==0||a[mid-1]<value) {
					return mid;
				}
				high=mid-1;
			
			} else if (a[mid] < value) {
				low = mid + 1;
			}
		}
		return -1;
	}
}
