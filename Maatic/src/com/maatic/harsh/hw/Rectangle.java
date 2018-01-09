package com.maatic.harsh.hw;

public class Rectangle extends GeoObj {
	double length;
	double breadth;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth= breadth;
	}
	
	public void getArea() {
		double area = length * breadth;
		System.out.println("The area of rectangle is: " + area);
	}
	
	public void getPerimeter() {
		double perimeter = 2* (length + breadth);
		System.out.println("The perimeter of rectangle is: " + perimeter);
	}
}
