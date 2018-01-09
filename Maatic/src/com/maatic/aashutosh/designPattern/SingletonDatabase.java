package com.maatic.aashutosh.designPattern;

public class SingletonDatabase {
	
	private static SingletonDatabase instance = new SingletonDatabase();
	
	private SingletonDatabase() {
		
	}
	
	public static SingletonDatabase getInstance() {
		/*if(instance == null)
			instance = new SingletonDatabase();*/
		return instance;
	}

}
