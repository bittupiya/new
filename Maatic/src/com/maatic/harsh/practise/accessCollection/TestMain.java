package com.maatic.harsh.practise.accessCollection;

public class TestMain {
	public static void main(String[] args) {
		TestStack ts = new TestStack();
		ts.push(2);
		ts.push(5);
		ts.push(10);
		System.out.println(ts.isEmpty());
		ts.pop();
		ts.print();
	}
}
