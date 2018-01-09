package com.maatic.harsh.hw;

public class Circle extends GeoObj{
	double radius;
	
	public Circle() {
		
	}
		
	public Circle(double radius) {
		this.radius = radius;
	}

	public void getArea() {
		double area = (Math.PI * radius * radius);
		System.out.println("The area of circle is: " + area);
	}
	
	public void getPerimeter() {
		double perimeter = (2 * Math.PI * radius);
		System.out.println("The perimeter of circle is: " + perimeter);
	}

}
