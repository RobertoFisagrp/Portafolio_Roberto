package SeptimoSetEjercicios;

abstract class Shape {
	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	public void displayInfo() {
		System.out.println("Shape: " + name);
		System.out.println("Area: " + calculateArea());
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		if (this.radius < 0) {
			return -1;

		}
		return Math.PI * this.radius * this.radius;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return this.length * this.width;
	}
}
