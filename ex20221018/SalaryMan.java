package com.human.ex20221018;

public class SalaryMan {
	static int monthpay = 1000000;

	public static void main(String[] args) {
		System.out.println(new SalaryMan(monthpay).getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross()); 
	}

	public SalaryMan(int i) {
		monthpay = i;
	}
	
	int getAnnualGross(){
		return monthpay*5;
	}
}
