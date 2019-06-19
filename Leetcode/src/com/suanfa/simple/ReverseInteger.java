package com.suanfa.simple;

/**
 * 数字反转 1234 → 4321 1999999999 → 返回0 超出int类型范围
 * 
 * @author majing
 *
 */
public class ReverseInteger {
	public static void main(String[] args) {
		int reverse = reverse(1999999999);
		System.out.println(reverse);

	}

	public static int reverse(int num) {
		int result = 0;
		while (num != 0) {
			int temp = num % 10;
			num = num / 10;
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) {
				System.out.println("太大了");
				return 0;
			}
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) {
				System.out.println("太小了");
				return 0;
			}
			result = result * 10 + temp;
		}
		return result;
	}
}
