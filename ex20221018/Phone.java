package com.human.ex20221018;

public class Phone{
	String number;
	String model;
	String color;
	String ownername;
	
	public Phone(String number, String model, 
			     String color, String ownername) {
		this.number = number;
		this.model = model;
		this.color = color;
		this.ownername = ownername;
	}
	public String toString() {
		return String.format("전화번호 : %s 모델명 : %s 색상 : %s  주인 : %s", number, model , color, ownername);
	}
	
	public void ChatingApp(String AppKind) {
		// TODO Auto-generated method stub
		
	}
}
