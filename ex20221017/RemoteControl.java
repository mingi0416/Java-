package com.human.ex20221017;

public interface RemoteControl {
	//인터페이스
	//변수선언 > 상수
	int MAX_VOLUME = 10; //최대볼륨
	int MIN_VOLUME = 0;  //최소볼륨
	
	//메소드 선언 > 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
