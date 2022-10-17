package com.human.ex20221017;

//interface 기준

public class SmartTelevision implements Smartable{	//RemoteControl ? , Searchable ?
	//클래스 필드 변수
	int volume;
	int inch;
	String brand;
	int smartModuleCount; //스마트 모듈 개수
	
	public SmartTelevision(String brand, int inch, int smartModuleCount) {
		this.brand = brand;
		this.inch = inch;
		this.smartModuleCount = smartModuleCount;
		this.volume = 0;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트TV를 킵니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else if(volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME; //볼륨조절 값
		}else {
			this.volume = volume;
		}
		
		System.out.println("스마트TV 볼륨 : " + this.volume);
	}

	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		System.out.println("스마트TV " + keyword + " 키워드로 검색합니다.");
	}

	@Override
	public void connectBluetooth() {
		// TODO Auto-generated method stub
		
	}
}
