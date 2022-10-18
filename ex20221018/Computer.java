package com.human.ex20221018;

public class Computer {

	public String[] osType = {"윈도우7", "애플 OS X", "안드로이드"};
	public int memory;
	public int num;
	
	Computer(int num, int memory){
		this.num = num;
		this.memory = memory;
	}
	
	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print(); 

	}

	void print() {
		System.out.println("운영체제 : " + osType[num] + ", 메인메모리 : " + memory);
	}

}
