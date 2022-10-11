package com.human.ex20221011;

public class Triangle {
	double i;
	double j;
	double width;
	double heigth;
	public void setsize(double i, double j) {
		this.width=i;
		this.heigth=j;
	}
	public double getArea1() {
		double getArea1 = (width*heigth)/2;
		return getArea1;
	}

}
