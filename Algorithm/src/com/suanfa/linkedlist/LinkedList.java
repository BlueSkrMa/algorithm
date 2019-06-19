package com.suanfa.linkedlist;

import java.util.ArrayList;

public class LinkedList {
	private Node head;
	//增
	public void add(int num) {
		if(head==null) {
			head=new Node();
			head.value=num;
			head.next=new Node();
			System.out.println("插入成功！");
			return;
		}
		Node temp=head.next;
		while(temp!=null) {
			temp.value=num;
			temp=temp.next;
			System.out.println(1);
		}
		temp=new Node();
	}
	//查
	public void show() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(head!=null) {
			list.add(head.value);
			Node temp=head.next;
			while(temp.next==null) {
				list.add(temp.value);
				temp=temp.next;
			}
		}
		System.out.println(list);
	}
}
class Node{
	public int value;
	public Node next;
}
