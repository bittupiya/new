package com.maatic.aashutosh.designPattern;

public enum ESingleton {
	INSTANCE;
	/*private ESingleton() {
		System.out.println("HERE");
	}*/
	
	
		public static void main(String[] args) {
			ESingleton s = ESingleton.INSTANCE;
			System.out.println(s);
		}
}
