package com.human.ex20221018;

import java.util.Scanner;

public class SmartPhone extends Phone implements PhoneAction, PhonePaySystem, ChatingApp{
	Scanner sc = new Scanner(System.in);
	public SmartPhone(String number, String model, String color, String ownername) {
		super(number, model, color, ownername);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰으로 전화통화를 합니다.");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰으로 검색을 합니다.");
	}

	@Override
	public void chatapp() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰으로 채팅앱을 합니다.");
	}

	@Override
	public void Pay_5G() {
		// TODO Auto-generated method stub
		System.out.println(ownername + "의 핸드폰 요금제는 5G입니다.");
	}

	@Override
	public void Pay_LTE() {
		// TODO Auto-generated method stub
		System.out.println(ownername + "의 핸드폰 요금제는 LTE입니다.");
	}

	@Override
	public void ChatingApp(String AppKind, int AppSize) {
//		if(AppKind=="카카오톡") {
//			System.out.println("카카오톡을 시작합니다. 앱 용량은 : "+AppSize + "mb 입니다");
//		}else if(AppKind=="페이스북") {
//			System.out.println("페이스북을 시작합니다. 앱 용량은 : "+AppSize + "mb 입니다");
//		}else if(AppKind=="텔레그렘") {
//			System.out.println("텔레그렘을 시작합니다. 앱 용량은 : "+AppSize + "mb 입니다");
//		}else{
//			System.out.println("없는 채팅앱입니다.");
//		}
		
	}

	public void ChatApp(String Appid, String AppKind) {
		System.out.println("아이디 : " + Appid + "로 " + AppKind + "를 사용해 메세지를 보냅니다.");
		System.out.println("보낼 채팅을 입력해주세요");
		System.out.println(Appid + " : " + sc.nextLine());
	}


//	public void UseApp(String Appid, String AppKind) {
//		System.out.println(AppKind+" " +Appid + " : " + sc.nextLine());
//		System.out.println("보낼 채팅을 입력해주세요");
//	}

//	@Override
//	public void ChatingApp() {
//		// TODO Auto-generated method stub
//		if(AppKind=="카카오톡") {
////			AppSize = 500;
//			System.out.println("카카오톡으로 메세지를 보냅니다.");
//		}else if(AppKind=="페이스북") {
////			AppSize = 700;
//			System.out.println("페이스북으로 메세지를 보냅니다.");
//		}else if(AppKind=="텔레그렘") {
////			AppSize = 900;
//			System.out.println("텔레그렘으로 메세지를 보냅니다.");
//		}else{
//			System.out.println("없는 채팅앱입니다.");
//		}
//	}


//	@Override
//	public void kakaoApp(String AppId, String AppName, String AppCompnay) {
//		// TODO Auto-generated method stub
//		System.out.println("카카오톡으로 메세지를 보냅니다.");
//	}
//
//	@Override
//	public void facebookApp(String AppId, String AppName, String AppCompnay) {
//		// TODO Auto-generated method stub
//		System.out.println("페이스북으로 메세지를 보냅니다.");
//	}
//
//	@Override
//	public void telegramApp(String AppId, String AppName, String AppCompnay) {
//		// TODO Auto-generated method stub
//		System.out.println("텔레그램으로 메세지를 보냅니다.");
//	}


}
