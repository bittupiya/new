package com.maatic.aashutosh.designPattern;

public class Singleton {
	
	private static Singleton obj;
	
	public String s;
	public String b = "Java Student.";
	
	private Singleton() {
		s = "Java Developer.";
	}
	
	public static Singleton getInstance() {
		if(obj== null) 
			obj = new Singleton();
			return obj;
	}
	
	
}
