package com.human.ex20221018;

public class ChatApp implements ChatingApp {
	
	String Appid = "";
	String AppName = ChatingApp.AppKind;
	String AppCompnay = ChatingApp.AppKind;
	
	ChatApp(String Appid){
		this.Appid = Appid;
		this.AppName = ChatingApp.AppKind;
		this.AppCompnay = ChatingApp.AppKind;
	}

	@Override
	public void ChatingApp(String AppKind, int AppSize) {
		// TODO Auto-generated method stub
		if(AppKind=="카카오톡") {
			System.out.println("카카오톡을 시작합니다. 앱 용량은 : "+AppSize + "mb 입니다");
		}else if(AppKind=="페이스북") {
			System.out.println("페이스북을 시작합니다. 앱 용량은 : "+AppSize + "mb 입니다");
		}else if(AppKind=="텔레그렘") {
			System.out.println("텔레그렘을 시작합니다. 앱 용량은 : "+AppSize + "mb 입니다");
		}else{
			System.out.println("없는 채팅앱입니다.");
		}
	}

}
