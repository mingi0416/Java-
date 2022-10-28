package com.human.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class java04ArrayList {

	public static void main(String[] args) {
		// ArrayList 연속된 데이터를 다루는 자료구조
		// collection
//		List arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//insert방법 add 사용
		arrayList.add(14);
		arrayList.add(15);
		arrayList.add(22);
		arrayList.add(10);
		arrayList.add(10);
		
		//select 방법 get
//		for(int i=0; i<arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
		
		arrayList.add(2, 19);
		arrayList.add(0, 1);
		System.out.println("==============");
		for(Integer i:arrayList) {
			System.out.println(i);
		}
	
		//remove 사용
		arrayList.remove(1); //기본자료형 int가 오면 해당 인덱스를 삭제
		arrayList.remove((Integer)1); //객체가 오면 해당 데이터를 삭제
		arrayList.remove((Integer)10);
		
		System.out.println("==============");
		Iterator<Integer> iter =  arrayList.iterator();
		while(iter.hasNext()) { //다음 데이터가 있는지 확인
			System.out.println(iter.next()); //다음 데이터를 리턴해주고 다음데이터로 인덱스를 옮김
		}
		System.out.println("==============");
		//indexof를 이용해서 들어있는 데이터의 인덱스 찾기
		int index = arrayList.indexOf((Integer)15);
		System.out.println(index);
		index = arrayList.indexOf(22); //자동형변환이 됨
		System.out.println(index);
		index = arrayList.indexOf(122); //없는 데이터는 -1로 출력
		System.out.println(index);
		
		index=22;
		if(arrayList.contains(index)) { //객체로 자동형변환됨
			System.out.println("arrayList에 " + index + "가 들어가 있음");
		}else {
			System.out.println("arrayList에 " + index + "가 안들어가 있음");
		}
		System.out.println("==============");
		
		//수정
		arrayList.set(1, 150);
		for(Integer i:arrayList) {
			System.out.println(i);
		}
		
	}

}
