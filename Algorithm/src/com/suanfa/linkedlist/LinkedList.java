package com.suanfa.linkedlist;

import java.util.ArrayList;

import com.suanfa.test.Node;

public class LinkedList {
	public Node head;
	
	//返回node，用于其他操作
	public Node returnNode() {
		return this.head;
	}
	//向末尾插入
	public void addToLast(int num) {
		Node node=new Node();
		node.value=num;
		if(head==null) {
			head=node;
			return;
		}
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
		}
		temp=node;
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
	//两个有序链表合并 1-3-4-7  2-3-5-6
	public static Node mergeNode(Node n1,Node n2) {
		Node cur1=n1;
		Node cur2=n2;
		Node node_ = new Node();
		Node node = node_;
		while(cur1!=null&&cur2!=null) {
			if(cur1.value<cur2.value) {
				node.next=cur1;
				cur1=cur1.next;
			}else {
				node.next=cur2;
				cur2=cur2.next;
			}
			node=node.next;
			
		}
		if(cur1!=null) {
			node.next=cur1;
		}
		if(cur2!=null) {
			node.next=cur2;
		}
		return node_.next;
	}
	//链表中环的检测
	public boolean isExsist(Node node) {
		if(node==null) {
			return false;
		}
		Node cuNode=node;
		ArrayList<Node> list = new ArrayList<Node>();
		while(cuNode!=null) {
			if(list.contains(cuNode)) {
				return true;
			}
			list.add(cuNode);
			cuNode=cuNode.next;
		}
		return false;
	}
	
}

