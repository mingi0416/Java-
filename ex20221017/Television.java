package com.human.ex20221017;

public class Television implements RemoteControl{
	//클래스 필드 변수
	int volume;
	int inch;
	String brand;
	
	Television(String brand, int inch){
		volume = 0;
		this.brand = brand;
		this.inch = inch;
	}
	
	void eneryOn() {
		System.out.println("tv 전원을 켭니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		//TV 볼륨조절 +, -
		
		//클래스 (필드, 생성자, 메소드(getter/setter + a))
		//setter 
		//1. 외부에 공개되지 않은 변수에 대한 접근 제공
		//private volume <-> public setVolume
		//2. 값을 조절 (사전에 필터링)
		// setter : 외부에서 잘못된 값이 들어올까봐..
		// getter : return할 양식을 변경
		// 이름을 짓는 양식
		// void set+변수명 
		// 변수의 타입 get+변수명
		
		//내 TV는 볼륨이 0 ~30
		if(volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else if(volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME; //볼륨조절 값
		}else {
			this.volume = volume;
		}
		
		System.out.println("TV 볼륨 : " + this.volume);
		//30으로 셋팅
		//TV리모콘 볼륨 0 ~ 30
		//BTV 셋톱박스 리모콘 볼륨 0 ~ 50
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVolume() {
		return volume;
	}

}
