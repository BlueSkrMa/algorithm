package com.suanfa.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	List<Integer> list;
	public Stack() {
		list=new ArrayList<Integer>();
	}
	
	public void push(int num) {
		list.add(num);
	}
	public int pop() {
		if(list.size()>0) {
			return list.remove(list.size()-1);
		}
		throw new OutOfMemoryError();
	}
	public int getMin() {
		if(list.size()<=0) {
			throw new OutOfMemoryError();
		}
		int min=list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(min>list.get(i)) {
				min=list.get(i);
			}
		}
		return min;
	}
	public boolean deleteTop() {
		if(list==null||list.size()==0) {
			return false;
		}
		return list.remove(list.size()-1)!=null;
	}
}
