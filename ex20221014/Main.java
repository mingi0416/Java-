package com.human.ex20221014;

public class Main {
	public static void main(String[] args) { // 객체   생성
		KRW krw = new KRW(1500, "원");
		USD usd = new USD(100.50, "달러");
		EUR eur = new EUR(260.87, "유로");
		JPY jpy = new JPY(1400, "엔");
		// 부모   클래스를    통한   그룹화
		Currency[] currencies = { krw, usd, eur, jpy }; // 모든   화폐정보를    출력
//		Currency[] currencies = new Currency[4];
//		currencies[0] = krw;
//		currencies[1] = usd;
		
//		for(int i=0; i<currencies.length; i++) {
//			System.out.println(currencies[i].toString());
//		}
		
		for (Currency c : currencies) {
			System.out.println(c.toString());
		}
	} 
}
/* 1. 부모 클래스 Currency를 만드시오. */ 
class Currency{
	double amount; // 수량(1000) 
	public String notation; // 표기법(원)
	
	//						1500, 			"원"		
	public Currency(double amount, String notation) {
		this.amount = amount;   
		this.notation = notation;
	}
	
	public String toString() {
		String result = String.format("%s: %.2f %s", getClass().getSimpleName() ,amount, notation);
		return result;
	}
	
}
/* 2. 상속을 통해 중복 코드를 제거 후, */
//O
/* 3. 생성자를 올바르게 수정하시오. */
//O
/* 4. toString() 메소드를    오버라이딩    하시오. */

class KRW extends Currency {
	
	//					1500, 			"원"
	public KRW(double amount, String notation) {
		//부모클래스 먼저 태어나고 -> 자식 클래스 태어나야...
		//      1500,  "원"
		super(amount, notation);
	}
	
	public String toString() {
		String result = String.format("KRW: %.2f %s", amount, notation);
		return result;
		
//		return String.format("KRW: %.2f %s", amount, notation);
	}
}
class USD extends Currency{
	public USD(double amount, String notation) { 
		super(amount, notation);
	}
	
	public String toString() {
		String result = String.format("USD: %.2f %s", amount, notation);
		//추가코드
		//추가코드
		//추가코드
		//추가코드
		//추가코드
		//추가코드
		//추가코드
		//추가코드
		//추가코드
		//추가코드
		return result;
	}
}
class EUR extends Currency{
	public EUR(double amount, String notation) { 
		super(amount, notation);
	}
	
	public String toString() {
		String result = String.format("EUR: %.2f %s", amount, notation);
		return result;
	}
}
class JPY extends Currency{
	public JPY(double amount, String notation) { 
		super(amount, notation);
	}
	
	public String toString() {
		String result = String.format("JPY: %.2f %s", amount, notation);
		return result;
	}
}
