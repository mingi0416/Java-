package com.human.ex20221011;

public class Circle {
	double setRadius;
	double i;
	static double PI = 3.14;
	
	public void setRadius(double i) {
		this.setRadius = i;
	}

	public double getArea() {
		double getArea = (setRadius*setRadius)*3.14;
		return getArea;
	}
}
