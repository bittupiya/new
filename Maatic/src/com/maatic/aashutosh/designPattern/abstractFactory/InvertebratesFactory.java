package com.maatic.aashutosh.designPattern.abstractFactory;

public class InvertebratesFactory implements AnimalFactory {

	@Override
	public Animal animalList(String animalType) {
		if(animalType == null)
			return null;
		if(animalType.equalsIgnoreCase("Protozoa"))
			return new Protozoa();
		else if(animalType.equalsIgnoreCase("Arthopoda"))
			return new Arthopoda();
		else if(animalType.equalsIgnoreCase("Moluska"))
			return new Moluska();
		
		return null;
	}

}
