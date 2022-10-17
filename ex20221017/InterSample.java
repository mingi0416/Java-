package com.human.ex20221017;

public class InterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.methodA();
		a.methodB();
		
		InterA ia = a;
		InterB ib = a;
	}

}

class ClassA implements InterA{

	@Override
	public void methodA() {
		System.out.println("methodA in classA");
	}
	public void methodB() {
		System.out.println("methodB in classB");
	}
	@Override
	public void methodC() {
		System.out.println("methodC in classC");
		
	}
}

interface InterA extends InterB, InterC{
	void methodA();
}

interface InterB{
	void methodB();
}

interface InterC{
	void methodC();
}