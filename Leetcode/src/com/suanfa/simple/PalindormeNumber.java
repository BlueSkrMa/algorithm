package com.suanfa.simple;

/**
 * 回文数 121 是 -121 121- 不是 01 不是
 * 
 * @param args
 */
public class PalindormeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindormeNumber(121));
	}

	public static boolean isPalindormeNumber(int num) {
		int as = num;
		if (num < 0) {
			return false;
		}
		if (num == 0) {
			return true;
		}
		int result = 0;
		while (num != 0) {
			int temp = num % 10;
			num = num / 10;
			result = result * 10 + temp;
		}
		System.out.println(result);
		if (result == as) {
			return true;
		} else {
			return false;
		}
	}
}
