package com.maatic.aashutosh.designPattern.abstractFactory;

public class FactoryProducer {
	
	public static AnimalFactory getAnimal(String factoryType) {
		if(factoryType.equalsIgnoreCase("Vertebrates"))
			return new VertebratesFactory();
		else if(factoryType.equalsIgnoreCase("Invertebrates"))
			return new InvertebratesFactory();
		else
			return null;
	}

}
