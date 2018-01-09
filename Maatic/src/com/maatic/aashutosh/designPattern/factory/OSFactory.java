package com.maatic.aashutosh.designPattern.factory;

public class OSFactory {
	
	public static OperatingSys getMethod(String phone) {
		if(phone == null) 
			return null;
		else if(phone.equalsIgnoreCase("ios"))
			return new Ios();
		else if(phone.equalsIgnoreCase("android"))
			return new Android();
		else if(phone.equalsIgnoreCase("windowsOs"))
			return new WindowsOS();
		else 
			return null;
	}

}
