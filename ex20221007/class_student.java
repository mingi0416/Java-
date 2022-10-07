package com.human.ex20221007;

import java.util.Scanner;

public class class_student {
	static Scanner scan = new Scanner(System.in);
   //학생정보를 담는 클래스
   //클래스를 토대로 학생정보 객체를 만드는 인스턴스를 대량으로 만들 예정
   //학생마다 저장해야 할 정보를 변수로 만들어야함 = 필드
   private String name;
   private String id;
   private String pw;
   
   public class_student() {
      
   }
   
   //생성자 : 학생정보 인스턴스를 만들 때 처음에 들어가야 할 데이터
   public class_student(String name, String id, String pw) {
      this.name = name;
      this.id = id;
      this.pw = pw;
   }
   
   //메서드
   public void getInfo() {
      System.out.println(name+id+pw);
   }
   
   //비밀번호 변경
   public void setPw() {
	  System.out.println("변경할 비밀번호를 입력하세요");
      this.pw = scan.nextLine();
   }
   
   //id값이 동일한지 확인
   public void checkId() {
      
   }

}