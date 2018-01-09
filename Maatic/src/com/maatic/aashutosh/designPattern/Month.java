package com.maatic.aashutosh.designPattern;

public enum Month {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;	

	public static void main(String[] args) {
		Month[] b = Month.values();
		for (Month b1 : b) {
			System.out.println(b1+ "\t" + b1.ordinal());
 
		}
	}

}


// Purpose of enum
// to define our own data type
// 