package com.maatic.aashutosh.designPattern.factory;

public class Ios implements OperatingSys {

	@Override
	public void vibrate() {
		System.out.println("IOS phone is vibrating");
	}

}
