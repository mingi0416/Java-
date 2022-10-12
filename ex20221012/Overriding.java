package com.human.ex20221012;

public class Overriding {
	public static void main(String[] args) {
		Square s = new Square(5, "정사각형");
		Triangle t = new Triangle(4, 3, "삼각형");
		Circle c = new Circle(4, "원");
		Shape[] shapes = { s, t, c };

		for (int i = 0; i < shapes.length; i++) {
			Shape tmp = shapes[i];
			System.out.printf("%s의 넓이 -> %.2f\n", tmp.name, tmp.area());
		}
	}
}

class Shape {
	int length;
	int base;
	int height;
	int radius;
	String name;

	Shape(int length, int base, int height, int radius, String name) {
		this.length = length;
		this.base = base;
		this.height = height;
		this.radius = radius;
		this.name = name;
	}
	public double area() {
		return area();
	}
}

class Square extends Shape {
	Square(int length, String name) {
		super(length, length, length, length, name);
	}
	public double area() {
		return length * length;
	}
}

class Triangle extends Shape {
	Triangle(int base, int height, String name) {
		super(base, base, height, height, name);
	}
	public double area() {
		return (base * height) / 2;
	}
}

class Circle extends Shape {
	Circle(int radius, String name) {
		super(radius, radius, radius, radius, name);
	}
	public double area() {
		return radius * radius * 3.14;
	}
}