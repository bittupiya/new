package com.maatic.harsh.practise.accessCollection;

class Car implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Car is starting.");
	}

	@Override
	public void move() {
		System.out.println("Car is moving.");
	}

	
	@Override
	public void stop() {
		System.out.println("Car is stoping.");
	}
	
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		v.move();
		v.stop();
	}

}
