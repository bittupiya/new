package com.maatic.aashutosh.designPattern.factory;

public class Android implements OperatingSys{
	
	@Override
	public void vibrate() {
		System.out.println("Android phone is vibrating.");
	}

}
