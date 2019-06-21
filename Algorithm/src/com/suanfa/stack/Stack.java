package com.suanfa.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<Integer> list;
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
		for (int i = 0; i < array.length; i++) {
			
		}
	}
	public boolean deleteTop() {
		
	}
}
