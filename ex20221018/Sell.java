package com.human.ex20221018;

import java.util.ArrayList;
import java.util.List;

public class Sell extends Food{

	public Sell(String name, int price, int count) {
		super(name, price, count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food kimbab = new Food("김밥", 4000 ,50);
		Food noodle = new Food("국수", 6000 ,30);
		Food hambuger = new Food("햄버거", 6000, 20);
//		ShowMenuList();
		kimbab.ShowMenuList();
		
	}
	
	public void FoodList(){
		
	}
	
}

class Food {
	String name;
	int price;
	int count;
	
	public Food(String name,int price,int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public String ShowMenuList(){
		System.out.println("메뉴 : " + name + " 가격 : " + price + " 갯수 : " + count);
		return name;
	}
}



