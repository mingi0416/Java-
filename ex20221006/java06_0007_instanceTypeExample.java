package com.human.ex20221006;

import java.util.Scanner;

public class java06_0007_instanceTypeExample {

   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
      // 1-6. 학생의 개인일정(privateToDo)과 공식일정(publicToDo)을
      // 만들어서 학생(student)에 추가하는 시스템에
      // 일정 인스턴스를 비교하여 추가하는 시스템 구성하시오
      // (isInstance를 사용하여 객체 타입을 구분)
      // 1) 학생(studnet) class, 개인일정(privateToDo) clas,
      // 공식일정(publicToDo) class 를 만드시오
      // 2) 학생 인스턴스 안에 개인일정, 공식일정을 추가하는 구조를 만드시오
      // 3) 일정을 추가할 때 객체를 비교하여 추가하는 시스템을 만드시오

      System.out.println("학생 이름을 작성하시오");
      class_student student01 = new class_student(scan.nextLine());

      System.out.println("개인일정을 추가할려면 1번, 공개일정을 추가할려면 2번");

      String input = scan.nextLine();

      //상속 ? 교과서 7~8장 : 인스턴스는 연결해주는 방향성을 갖고 있따면 (참조타입)
      //상속은 수직으로 확장해나가는 방향성
      //가장 처음 시점의 부모(조상)은 Object에서 시작해서 타입을 다양하게 만듬
      //예) Object에서 문자열을 받는 타입을 만드는 것이 String
      //Object에서 정수를 받는 타입을 만드는 것이 int
      //int에서 참조타입으로 확장해나가는 것이 Integer
      
      Object inputType = new Object();
//      String name = "김민기";
//      //자동형변환이 쉽다 (Object가 가장 큰 범위를 갖고 있는 타입)
//      inputType = name;
      
      if (input.equals("1")) {
         System.out.println("개인일정을 작성하시오. 할일/시간");
         inputType = new class_privateToDo(scan.nextLine(), scan.nextInt());
         scan.nextLine();

      } else if (input.equals("2")) {
         System.out.println("공개일정을 작성하시오. 할일/시간");
         inputType = new class_publicToDo(scan.nextLine(), scan.nextInt());
         scan.nextLine();
      }
      //class.isInstance ㅔ멋드를 사용하여 타입을 구분하는 조건문을 작성
      if(class_publicToDo.class.isInstance(inputType)) {
    	  //(class_publicToDo)inputType : inputType은 Object타입이므로
    	  //가장 큰 범위를 가진 타입을 작은 타입으로 형변환 할 때
    	  //강제 형변환이 필요 : (class_publicToDo)
         student01.setClass_publicTodo((class_publicToDo)inputType);
         System.out.println("공개일정 추가하였습니다");
      }else if(class_privateToDo.class.isInstance(inputType)) {
         student01.setClass_privateTodo((class_privateToDo)inputType);
         System.out.println("개인일정 추가하였습니다");
      }

   }

}