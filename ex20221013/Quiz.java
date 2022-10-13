package com.human.ex20221013;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
	}

}
class A{
	A(){
		this(30);
		System.out.println("A()");
	}
	A(int a){
		System.out.println("A(int a)");
	}
}
class B extends A{
	B(){
		this(10);
		System.out.println("B()");
	}
	B(int b){
		System.out.println("B(int b)");
	}
}