package com.human.code20220919;

import java.util.Scanner;

public class QuestionStep1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questionStep1_1();
	}
	
//	public static int menuChoice(int MenuChoice, int MenuCount) {
//		int price = 0;
//			if(MenuChoice == 1) {
//		    price = 9000;
//		}else if(MenuChoice == 2) {
//		     price = 8000;
//		}
//		 return price*MenuCount;
//}
		   
	 public static void questionStep1_1() {
		 //당신 옆 가게 떡볶이 집이 잘되는 것을 부러워하는 돈가스 집의 오너입니다.
	     //다음과 같은 메뉴를 가진 키오스크 시스템을 구축하시오.
	     //1. 안심 돈가스 : 9000원
	     //2. 등심 돈가스 : 8000원
	     //(단, 고객을 확하기하기 위해 
	     //만원이상이면 10%할인, 2만원이상이면 20%할인을 하는
	     //만원 단위별로 10%씩 증가하는 
	     //최대 50%할인 대박세일을 진행하려 합니다)
		 
		 Scanner sc = new Scanner(System.in);
//		 int MenuChoice = 0;
		 String MenuString = "";
		  
		 
		 System.out.println("|----------------------------|");
		 System.out.println("|----안녕하세요  돈가스 집입니다---|");
		 System.out.println("|--------메뉴를선택하세요. ------|");
		 System.out.println("|1. 안심 돈가스 : 가격 개당 9000원|");
		 System.out.println("|2. 등심 돈가스 : 가격 개당 8000원|");
		 System.out.println("|----------------------------|");
		 
		 
		 int MenuChoice = sc.nextInt();
		 
		 System.out.println("개수를 입력하세요");
		 int MenuCount = sc.nextInt();
		 
		   
		 int price = 0;  
		 if(MenuChoice == 1) {
			   MenuString = "안심 돈가스";
			   price = 9000;
		
		 }else if(MenuChoice == 2) {
			   MenuString = "등심 돈가스";
			   price = 8000;
		 }
		 
		 //TP = TotalPrice
		 int TP = price*MenuCount;
		 if(10000<=TP && TP<20000) {
			 System.out.println("주문하신 메뉴는 " + MenuString + "이고, 주문하신 갯수는 "
					 + MenuCount + "개 입니다.");
			 System.out.println("할인 전 가격은 " + TP + "원 입니다.");
			 System.out.println("만원 이상 구매하셔서 10% 할인이 됩니다. " + (int)((TP)*0.9)
			 + "원 입니다.");
		 }
		 else if(20000<=TP && TP<30000) {
			 System.out.println("주문하신 메뉴는 " + MenuString + "이고, 주문하신 갯수는 "
					 + MenuCount + "개 입니다.");
			 System.out.println("할인 전 가격은 " + TP + "원 입니다.");
			 System.out.println("2만원 이상 구매하셔서 20% 할인이 됩니다. " + (int)((TP)*0.8)
			 + "원 입니다.");
		 }
		 else if(30000<=TP && TP<40000) {
			 System.out.println("주문하신 메뉴는 " + MenuString + "이고, 주문하신 갯수는 "
					 + MenuCount + "개 입니다.");
			 System.out.println("할인 전 가격은 " + TP + "원 입니다.");
			 System.out.println("3만원 이상 구매하셔서 30% 할인이 됩니다. " + (int)((TP)*0.7)
			 + "원 입니다.");
		 }
		 else if(40000<=TP && TP<50000) {
			 System.out.println("주문하신 메뉴는 " + MenuString + "이고, 주문하신 갯수는 "
					 + MenuCount + "개 입니다.");
			 System.out.println("할인 전 가격은 " + TP + "원 입니다.");
			 System.out.println("4만원 이상 구매하셔서 40% 할인이 됩니다. " + (int)((TP)*0.6)
			 + "원 입니다.");
		 }
		 else if(TP>=50000) {
			 System.out.println("주문하신 메뉴는 " + MenuString + "이고, 주문하신 갯수는 "
					 + MenuCount + "개 입니다.");
			 System.out.println("할인 전 가격은 " + TP + "원 입니다.");
			 System.out.println("5만원 이상 구매하셔서 50% 할인이 됩니다. " + (int)((TP)*0.5)
			 + "원 입니다.");
		 }
		   
	 }
}
