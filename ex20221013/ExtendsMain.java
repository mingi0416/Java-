package com.human.ex20221013;

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Parent p1 = new Parent();
//		System.out.println(p1.name);
//		p1.parentInfo();
		
//		Child c1 = new Child();
//		System.out.println(c1.money);
//		c1.childInfo();
//		c1.parentInfo();
		
		Child c2 = new Child();
		c2.parentInfo();
	}

}

class Parent{
	String name = "나부모"; //이름
	int money = 500; //자산
	Parent(){
		
	}
	
	Parent(int money){
		this.money = money;
	}
	void parentInfo() {
		System.out.println( name + " - " + money);
	}
}

class Child extends Parent{
	int grade = 3;
	
	Child(){
		super(1000);
	}
	
	Child(int grade){
		super(5000);
		this.grade = grade;
	}
	void childInfo() {
		System.out.println(grade + "학년");
	}
	void parentInfo() {
		System.out.println("우리 부모님은 " + name + " - " + money);
	}
}