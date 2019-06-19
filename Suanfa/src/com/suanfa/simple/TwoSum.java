package com.suanfa.simple;

import java.util.Arrays;

/**
 * 数组中两个数相加等于一个值的两个下标
 * 
 * @author majing
 *
 */
public class TwoSum {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(index(new int[] { 1, 12, 3, 4, 5, 7, 9 }, 18)));
	}

	public static int[] index(int[] arr, int num) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		for (int i = 0; i < arr.length; i++) {
			int compareInt = num - arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				if (arr[j] == compareInt) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
}
