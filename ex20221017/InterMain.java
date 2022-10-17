package com.human.ex20221017;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television("삼성", 50);
		tv.turnOn();
		tv.setVolume(8);
		tv.turnOff();
		tv.getInch();
		
		turnOffItem(tv);
		
		RemoteControl rc = new Television("LG", 55);
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		turnOffItem(rc);
		
		Audio ad = new Audio("아이리버", "흰색");
		ad.turnOn();
		ad.turnOff();
		ad.setVolume(30);
		System.out.println(ad.toString());
		
		RemoteControl rc2 = new Audio("소니", "검은색");
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(-5);
		System.out.println(rc2.toString());
		
		turnOffItem(rc2);
		turnOffItem(ad);
		
		
		SmartTelevision stv = new SmartTelevision("노브랜드", 65, 4);
		stv.turnOn();
		stv.turnOff();
		stv.setVolume(5);
		stv.search("천안역 맛집");
//		System.out.println(stv.toString());
		System.out.println("==================================");
		//1번
		RemoteControl rcStv = new SmartTelevision("노브랜드", 70, 4);
		rcStv.turnOn();
		rcStv.turnOff();
		rcStv.setVolume(8);
//		System.out.println(rcStv.toString());
		Searchable saStv = new SmartTelevision("노브랜드", 60, 4);
		saStv.search("식당");
//		System.out.println(saStv.toString());
		System.out.println("==================================");
		//2번
		SmartTelevision myStv = new SmartTelevision("노브랜드", 70, 4);
		RemoteControl rcMyStv = myStv;
		rcMyStv.turnOn();
		rcMyStv.setVolume(7);
		Searchable saMyStv = myStv;
		saMyStv.search("맛집");
		//가장 큰 차이점이 뭘까?
		
		RemoteControl[] rcs = {tv, ad, stv};
		
		for(RemoteControl r : rcs) {
			r.setVolume(RemoteControl.MAX_VOLUME);
		}
		System.out.println("==================================");
		
		GoodTelevision gtv = new GoodTelevision("구글", 40, 6);
		gtv.turnOn();
		gtv.setVolume(5);
		gtv.turnOff();
		gtv.search("자바");
		
		RemoteControl rcGtv = gtv; //인터페이스
		Searchable saGtv = gtv;    //인터페이스
		Television ttv = gtv;      //상속
		
//		Searchable[] sas = {tv, ad, stv};
	}

	public static void turnOffItem(RemoteControl rc) {
		rc.turnOff();
	}
}
