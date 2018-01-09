package com.maatic.aashutosh.designPattern;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		
		System.out.println("I am a " + x.s);
		System.out.println("I am a " +x.b);
	}

}
