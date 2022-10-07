package com.human.ex20221006;

import java.util.Scanner;

public class java06_0006_instanceAndStatic {

   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      
	   //20221006 history
	   //1) 인스턴스와 생성자
	   //클래스(설계도)에서 동일한 모양으로 찍어내는 인스턴스
	   //다형성(다양한 스타일로)을 위해 생성자의 매개변수로 다양한 데이터로
	   //인스턴스를 생성
	   //2) static과 인스턴스 데이터 공유
	   //인스턴스의 필드는 고유의 데이터나, static이 붙은 필드 데이터는
	   //같은 클래스 내에서 공유함
	   //3) isInstance와 Object
	   //isInstance는 런타임 시점에서 타입을 비교
	   //OPbject는 모든 타입의 부모(선조)이므로 자동형변환이 가능
	   
	  String stringA = scan.nextLine();
	  Integer intA = scan.nextInt();
	  //int intA = scan.nextInt();
	  scan.nextLine();
	  
//	  checkType(stringA);
	  checkType(intA);
	   
	  
	   
      class_example instance0001 = new class_example("김준석");
      class_example instance0002 = new class_example("박준석");
//      class_student instance0003 = new class_student("김준석");
      
      String test = "김준석";
      String test1 = "김준석";
      int test2 = 3;
      int test4 = 4;
      Integer test5 = 5;
      //1. 숫자 비교
      //2. 문자열 비교
      //3. 타입 비교 : 조건문에 (변수명 instanceof 타입명 : 컴파일 단계에서 소속 찾음)
      //A instanceof B : A변수가 B타입"계열"인지 확인하는 메서드(같은 것만 가능)
      //isInstance : [런타임 단계]에서 같은 "계열" 타입인지 확인
      //A.class.isInstance(B) : B변수가 A타입인지 확인
//      System.out.println(class_student.class.isInstance(instance0003));
      System.out.println(test instanceof String);
      
      //class_example instance0001 : 
      //타입을 class_example으로 한 instance0001 변수 선언 
      // = stack 메모리에 선언을 한다 (=존재한다)
      // new class_example(scan.nextLine()); :
      // new class_example : 인스턴스를 만든다
      // (scan.nextLine()) : 키보드로 받은 문자열값을 인자값으로 전달하고
      // 생성자를 통해서 인스턴스를 만듬
      
//      
//      //1) 인스턴스는 참조타입으로 변수명에 주소값을 연결하여 존재
//      //2) 인스턴스가 만들어지면 고유에 필드데이터를 갖고 있음. 
//      //단, static은 같은 클래스이면 모두 공유하는 필드데이터
//      
//      instance0001.ouput();
//      instance0002.ouput();
//      
//      System.out.println("그룹을 변경하겠습니다, 숫자를 작성해 주세요");
//      //setGroup() 메서드를 사용하여 group필드값을 변경
//      //단, group은 static 선언되어서 
//      //같은 클래스의 모든 group 변수 데이터는 모두 수정됨
//      instance0001.setGroup(scan.nextInt());
//      scan.nextLine();
//      
//      instance0001.ouput();
//      instance0002.ouput();
//      
//      System.out.println("과자를 변경하겠습니다, 문자열를 작성해 주세요");
//      instance0001.setSnack(scan.nextLine());
//      
//      instance0001.ouput();
//      instance0002.ouput();
      
      
//      *인스턴스
//      1. 참조타입은 리터럴과 인스턴스 두 종류이다
//      예) 일반 String과 new String
//      2. 보통 참조타입이면 인스턴스이다
      
      //*메모리 주소 확인
      //System.indentityHashCode(변수이름)


      // 1-4. 지난 문제인 학생목록 class안에 toDoList class를 넣어
      // 관리시스템을 구성하시오
      // (다중 인스턴스 생성, 참조객체 자유구사, 인스턴스 관리)
      // code20221004 package 내에 class_StudentList와
      // code20221005 package 내에 class_toDoList 사용
      // 1) class_StudentList 인스턴스를 만들 때 
      // class_toDoList 필드 인스턴스를 생성자로 생성하는 코드 작성
      // 2) class_StudentList 인스턴스 생성 시 인자값을 사용하여
      // class_toDoList 생성자 생성
      
      // example 문제.
      // instance에 데이터와 static 데이터 사용을 통해
      // 그룹별로 객체관리하기
      
      // 1-5. Scanner로 받은 데이터 타입이 무엇인지 출력하는 메서드를 만드시오
      // 1) Scanner로 1번이면 String, 2번이면 int로 받도록 만드시오
      // 2) 1번으로 받은 데이터가 어떤 타입인지 출력하는 메서드를 만드시오

      // *1-6. 학생의 개인일정(privateToDo)과 공식일정(publicToDo)을
      // 만들어서 학생(student)에 추가하는 시스템에 
      // 일정 인스턴스를 비교하여 추가하는 시스템 구성하시오
      // (instanceOf를 사용하여 객체 타입을 구분)
      // 1) 학생(studnet) class, 개인일정(privateToDo) clas, 
      // 공식일정(publicToDo) class 를 만드시오
      // 2) 학생 인스턴스 안에 개인일정, 공식일정을 추가하는 생성자를 만드시오
      // 3) 일정을 추가할 때 객체를 비교하여 추가하는 시스템을 만드시오

      // #오버로딩 이해하기
      // 2-1. 필수사항(id, pw) 외 선택사항(email, tel, address)를
      // 저장하는 인스턴스를 만드시오
      // (인스턴스 다양화, 데이터 저장과 수정)

   }

   //Object 타입이란 모든 타입을 대변할 수 있는 타입 (모든 타입 선조)
   //Object는 모든 타입의 선조이므로, 자동 캐스팅 가능
   //자동 캐스팅이 가능한 것은 어떤 타입보다 더 큰 범위 갖고있다
   private static void checkType(Object data) {
	   if(String.class.isInstance(data)) {
		   System.out.println(data+" : 문자열 입니다");
	   }else if(Integer.class.isInstance(data)) {
		   System.out.println(data+" : 정수 입니다");
	   }else if(boolean.class.isInstance(data)) {
		   System.out.println(data+" : 불린 타입입니다");
	   }
	
}

}