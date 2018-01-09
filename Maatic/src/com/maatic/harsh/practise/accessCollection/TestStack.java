package com.maatic.harsh.practise.accessCollection;

public class TestStack {
	
	int top=-1;
	int[] a = new int[5];
	
	void push(int k) {
		if(top<a.length-1) {
			top++;
			a[top] = k;
		}
	}
	
	void pop() {
		if(isEmpty()) {
			top--;
		}
		else {
			top= top;
		}
	}
	
	public boolean isEmpty() {
		if(top>-1) 
			return true;
		else
			return false;
	}
	
	void print() {
		for(int i = 0; i<top+1;i++) {
			System.out.println(a[i]);
		}
	}

}
