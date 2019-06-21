package com.suanfa.linkedlist;

import java.util.ArrayList;

public class LinkedList {
	private Node head;
	//向末尾插入
	public void addToLast(int num) {
		Node node=new Node();
		node.value=num;
		if(head==null) {
			head=node;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	//查看所有
	public void showAll() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(head!=null) {
			Node node=new Node();
			Node temp=head;
			while(temp!=null) {
				list.add(temp.value);
				temp=temp.next;
			}
		}
		System.out.println(list);
	}
	//单链表反转
	public void fanZhaun() {
		if(head==null||head.next==null) {
			System.out.println("错误！");
			return;
		}
		Node preNode=null;
		Node curNode=head;
		while(curNode!=null) {
			Node next=curNode.next;
			curNode.next=preNode;
			preNode=curNode;
			curNode=next;
		}
		head=preNode;
	}
}
class Node{
	public int value;
	public Node next;
}
