package com.maatic.aashutosh.designPattern.factory;

import java.util.Scanner;

public class LivingBeingTest {
	public static void main(String[] args) {
		System.out.println("Choose human/animal/plant");
		Scanner sc = new Scanner(System.in);
		String choose = sc.nextLine();
		LivingBeing livingBeing = LivingBeingFactory.getlivingBeing(choose);
		livingBeing.respire();
	}

}
