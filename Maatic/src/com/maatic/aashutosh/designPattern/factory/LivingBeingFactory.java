package com.maatic.aashutosh.designPattern.factory;

public class LivingBeingFactory {
	public static LivingBeing getlivingBeing(String livingBeingType) {
		if(livingBeingType== null)
			return null;
		else if(livingBeingType.equalsIgnoreCase("human"))
			return new Human();
		else if(livingBeingType.equalsIgnoreCase("animal"))
			return new Animal();
		else if(livingBeingType.equalsIgnoreCase("plant"))
			return new Plant();
		else
			return null;
	}

}
