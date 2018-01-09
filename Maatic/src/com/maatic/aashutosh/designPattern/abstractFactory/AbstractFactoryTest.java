package com.maatic.aashutosh.designPattern.abstractFactory;

import java.util.Scanner;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		System.out.println("Choose: Vertebrates / Invertebrates ?");
		Scanner sc = new Scanner(System.in);
		String VorI = sc.nextLine();
		String ani = null;
		if (VorI == null) {
			System.out.println("Enter some data.");
		} else if (VorI.equalsIgnoreCase("vertebrates") || VorI.equalsIgnoreCase("invertebrates")) {
			if (VorI.equalsIgnoreCase("vertebrates")) {
				System.out.println("Choose: Mammal / Bird / Reptile ");
				ani = sc.nextLine();
			} else if (VorI.equalsIgnoreCase("invertebrates")) {
				System.out.println("Choose: Arthopoda / Moluska / Protozoa ");
				ani = sc.nextLine();
			}
		} else {
			System.out.println("Wrong Entry. Try Again.");
		}

		AnimalFactory obj = FactoryProducer.getAnimal(VorI);
		obj.animalList(ani).move();

		sc.close();

	}
}