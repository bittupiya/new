package com.maatic.aashutosh.designPattern.factory;

import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
		System.out.println("Choose IOS / Android / WindowsOS:");
		Scanner sc = new Scanner(System.in);
		String phone = sc.nextLine();
		if(phone.equalsIgnoreCase("ios") || phone.equalsIgnoreCase("android") || phone.equalsIgnoreCase("windowsOS")) {
		OperatingSys os = OSFactory.getMethod(phone);
		os.vibrate();
		}
		else {
			System.out.println("Wrong information");
		}
	}

}
