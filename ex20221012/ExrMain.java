package com.human.ex20221012;

public class ExrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTv = new TV("LG", 2021, 43);
		myTv.Show();
		
		TV myTv2 = new TV("SamSung", 2022, 85);
		myTv2.Show();
	}
}

	class TV {
		String brand;
		int year;
		int inch;

		TV(String brand, int year, int inch) {
			this.brand = brand;
			this.year = year;
			this.inch = inch;
		}

		void Show() {
			System.out.printf("%s제품 %d년형 %d인치 TV\n", brand, year, inch);

		}
	}
