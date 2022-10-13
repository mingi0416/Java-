package com.human.ex20221013;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====Mother=====");
		Mother mother = new Mother("엄마", 20000);
		mother.printInfo();
		mother.earnMoney();
		mother.printInfo();
		System.out.println();
		
		System.out.println("=====child1=====");
		child1 child1 = new child1("아들", 10000, "학생");
		child1.printInfo();
		child1.earnMoney();
		child1.printInfo();
		child1.earnMoneyMotherChance();
		child1.printInfo();
		child1.donate();
		child1.printInfo();
		System.out.println();
		
		System.out.println("=====child2=====");
		child2 child2 = new child2("딸", 50000, "변호사");
		child2.printInfo();
		child2.earnMoney();
		child2.printInfo();
		child2.donate();
		child2.printInfo();
	}

}
class Mother{
	String name;
	int money;
	private int pocketMoney = 30000;
	Mother(String name, int money){
		this.name = name;
		this.money = money;
	}
	void earnMoney(){
		System.out.println("돈 벌기 +10000");
		money = money + 10000;
	}
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("자산 : " + money);
	}
	final void donate() {
		System.out.println("2000원 기부");
		money -= 2000;
	}
}

class child1 extends Mother{
	String job;
	child1(String name, int money, String job){
	super(name, money);
	this.job = job;
	}
	void earnMoney(){
		System.out.println("돈 벌기 +3000");
		money = money + 3000;
	}
	void earnMoneyMotherChance() {
		super.earnMoney();
	}
//	void donate() {
//		System.out.println("300원 기부");
//		money -= 300;
//	}
	
}
class child2 extends Mother {
	String job;
	child2(String name, int money, String job){
		super(name, money);
		this.job = job;
	}
	void earnMoney(){
		System.out.println("돈 벌기 +50000");
		money = money + 50000;
	}
//	void printInfo() {
//		System.out.println("자산 : " + money + "/ 숨겨둔 비상금 : " + pocketMoney);
//	}
}