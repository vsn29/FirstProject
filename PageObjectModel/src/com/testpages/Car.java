package com.testpages;

public class Car {

	String color;
	String name;
	String model;

	Car(String color, String name, String model) {

		this.color = color;
		this.name = name;
		this.model = model;

	}

	Car() {

	}

	public void start() {
		System.out.println("Started");
	}

	public void run() {

		System.out.println(".....");

	}

	public static void main(String[] args) {

		Car car1 = new Car("red", "Alto", "Maruti");

		Car car2 = new Car("silver", "Alto", "Maruti");

		Car car3 = new Car();

		System.out.println(car1.color);
		System.out.println(car2.color);
		System.out.println(car3.color);

	}
}
