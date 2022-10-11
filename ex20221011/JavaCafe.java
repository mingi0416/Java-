package com.human.ex20221011;

public class JavaCafe {
public static void main(String[] args) {
printPay(10.00, 40);
printPay(10.00, 50);
printPay(7.50, 38);
printPay(8.50, 66);
}
// 시급과 일한 시간을 입력받아, 주급을 출력
public static void printPay(double basePay, int hours) {
//	if(hours<=40 && basePay>8.00) {
//	double pay = basePay*hours;
//	System.out.printf("$ %.2f\n", pay);
//	}else if(hours>40 && hours<=60) {
//		double pay = (basePay*1.5)*hours;
//		System.out.printf("$ %.2f\n", pay);
//	}else if(hours>60) {
//		double pay = (basePay*1.5)*hours;
//		System.out.println("주 60시간을 초과근무했습니다");
//		System.out.printf("$ %.2f\n", pay);
//	}
	if(basePay>8) {
		if(hours<=40) {
			double pay = basePay*hours;
			System.out.printf("$ %.2f\n", pay);
			}else if(hours>40 && hours<=60) {
				double pay = (basePay*1.5)*hours;
				System.out.printf("$ %.2f\n", pay);
			}else if(hours>60) {
				double pay = (basePay*1.5)*hours;
				System.out.println("주 60시간을 초과근무했습니다");
				System.out.printf("$ %.2f\n", pay);
			}
	}else if(basePay<8) {
		System.out.println("최저 시급보다 시급이 낮습니다");
		if(hours<=40) {
			double pay = basePay*hours;
			System.out.printf("$ %.2f\n", pay);
			}else if(hours>40 && hours<=60) {
				double pay = (basePay*1.5)*hours;
				System.out.printf("$ %.2f\n", pay);
			}else if(hours>60) {
				double pay = (basePay*1.5)*hours;
				System.out.println("주 60시간을 초과근무했습니다");
				System.out.printf("$ %.2f\n", pay);
			}
	}

/* 해당 메소드를 완성하세요. */

	
}
}