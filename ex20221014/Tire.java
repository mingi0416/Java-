package com.human.ex20221014;

public interface Tire {
	
	//필드
//	public int maxRotation = 15;     			//최대 회전수(최대 수명)
//	public int accumulatedRotation = (int)((Math.random()*14)+1);		//누적 회전수
//	public String location = "";       			//타이어의 위치
	public boolean roll();

//	public boolean roll() {  //굴러가기
//		++accumulatedRotation;		 //누적 회전수 
//		if(accumulatedRotation<maxRotation) {			//       6    -    1  = 5
//			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
//			return true;
//		} else {
//			System.out.println("*** " + location + " Tire 펑크 ***");
//			return false;
//		}
//	}
}












