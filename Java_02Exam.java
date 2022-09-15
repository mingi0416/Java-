package com.human.code20220915;

public class Java_02Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = examEvenAndOddCustom(30);
//		System.out.println("2~5의 배수의 개수는 = " + result + "입니다");
			
	}
	public static double examEvenAndOddCustom(int num) {
		System.out.println("매개변수는 " + num + "입니다");
		int count = 0;
		for(double i=1; i<=num; i++) {
			if(i%2==0) {
				count++;
				System.out.println(i + "의 값은 2의 배수 입니다!");
			}
			if(i%3==0) {
				count++;
				System.out.println(i + "의 값은 3의 배수 입니다!");
			}
			if(i%4==0) {
				count++;
				System.out.println(i + "의 값은 4의 배수 입니다!");
			}
			if(i%5==0) {
				count++;
				System.out.println(i + "의 값은 5의 배수 입니다!");
			}		
		}
		System.out.println("2~5의 배수의 개수는 = " + count + " 개 입니다");
		return count;
	}
	
}
