package com.suanfa.test;

import com.suanfa.linkedlist.LinkedList;
import com.suanfa.test.Node;
public class Test {
	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		list.addToLast(1);
//		list.addToLast(3);
//		list.addToLast(5);
//		list.addToLast(9);
//		list.showAll();
//		Node n1 = list.returnNode();
//		System.out.println("------");
//		LinkedList list2 = new LinkedList();
//		list2.addToLast(2);
//		list2.addToLast(4);
//		list2.addToLast(5);
//		list2.addToLast(11);
//		list2.showAll();
//		Node n2 = list2.returnNode();
//		System.out.println("-------");
//		Node node = LinkedList.mergeNode(n1, n2);
//		LinkedList list3 = new LinkedList();
//		list3.head=node;
//		list3.showAll();
		Node a1 = new Node();
		Node a2 = new Node();
		Node a3 = new Node();
		Node a4 = new Node();
		Node a5 = new Node();
		a1.value=1;
		a1.next=a2;
		a2.value=2;
		a2.next=a3;
		a3.value=3;
		a3.next=a4;
		a4.value=4;
		a4.next=a5;
		a5.value=5;
		a5.next=a2;
		boolean exsist = new LinkedList().isExsist(a1);
		System.out.println(exsist);
	}
}
