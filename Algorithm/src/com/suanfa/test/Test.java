package com.suanfa.test;

import com.suanfa.linkedlist.LinkedList;

public class Test {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addToLast(1);
		list.addToLast(2);
		list.addToLast(3);
		list.addToLast(4);
		list.showAll();
		list.fanZhaun();
		list.showAll();
	}
}
