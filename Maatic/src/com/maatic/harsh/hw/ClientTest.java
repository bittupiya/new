package com.maatic.harsh.hw;

public class ClientTest {
	public static void main(String[] args) {
		GeoObj obj1 = new Circle(5);
		obj1.getArea();
		obj1.getPerimeter();
		
		GeoObj obj2 = new Rectangle(10,5);
		obj2.getArea();
		obj2.getPerimeter();
	}
}
