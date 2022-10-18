package com.human.ex20221018;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp1 = new SmartPhone("010-1234-5678", "갤럭시S22", "검은색", "김민기");
		System.out.println(sp1.toString());
		sp1.search();
		sp1.call();
		sp1.chatapp();
		sp1.Pay_5G();
		System.out.println("===========");
		sp1.ChatingApp("카카오톡", 500);
		sp1.ChatApp("mingi0416", "카카오톡");
		System.out.println();
		SmartPhone sp2 = new SmartPhone("010-9797-8989", "아이폰 9", "흰색", "김민수");
		System.out.println(sp2.toString());
		sp2.Pay_LTE();
		sp1.ChatingApp("페이스북", 700);
		sp2.ChatApp("minsu0505", "페이스북");

		
	}

}
