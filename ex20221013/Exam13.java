package com.human.ex20221013;

public class Exam13 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int a = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				a = j+1;
				arr[i][j] = a;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
	}
	}
}
