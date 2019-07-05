package com.suanfa.test;

import java.math.BigDecimal;
import java.util.Arrays;

import com.suanfa.linkedlist.LinkedList;
import com.suanfa.test.Node;
public class Test {
	public static void main(String[] args) {
		long temp;
		
		temp=12;
		System.out.println(temp);
		A();
	}
	public static void A() {
		long temp;
		long l1 = System.currentTimeMillis();
		for (long i = 0; i < 9999999999l; i++) {
			temp=i;
			i=i+1;
		}
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
	}
}
