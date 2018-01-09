package com.maatic.aashutosh.designPattern.factory;

public class WindowsOS implements OperatingSys {

	@Override
	public void vibrate() {
		System.out.println("Windows phone is vibrating");
	}

}
