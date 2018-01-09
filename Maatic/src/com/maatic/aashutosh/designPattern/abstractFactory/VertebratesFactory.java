package com.maatic.aashutosh.designPattern.abstractFactory;

public class VertebratesFactory implements AnimalFactory {

	@Override
	public Animal animalList(String animalType) {
		if(animalType == null) 
			return null;
		else if(animalType.equalsIgnoreCase("Mammal"))
			return new Mammal();
		else if(animalType.equalsIgnoreCase("Bird"))
			return new Bird();
		else if(animalType.equalsIgnoreCase("Reptile"))
			return new Reptile();

		return null;
	}

}
