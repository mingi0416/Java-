package com.human.ex20221007;

import java.util.ArrayList;
import java.util.Scanner;

public class java07_0010_accountSystem {
   
   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
      //#회원가입 시스템 만들기
      //1) 학생 정보를 입력받는 시스템
      //회원정보들을 관리하는 객체와 (class_studentList)
      // - 인스턴스를 만들어서 회원정보관리 객체를 여러개 만들 필요가 있는지? (그룹별)
      // - 만일, 여러개 만들 필요가 없다면 어떻게 생성을 할지? (static, *싱글톤)
      //회원의 정보를 담는 인스턴스의 조합 (class_student)
      // - 회원 한명당 인스턴스 하나씩 만들어서
      // - 회원정보를 관리하는 객체에 저장하는 시스템을 어떤 방식으로 구현할지?
      // (배열<고정, 가변>로 관리할지 혹은 객체를 또 만들어서 관리할지)
      //student클래스와 studentList클래스의 포함관계
      //2) 비밀번호를 바꾸는 시스템
      //student클래스 안에 필드값 id, pw, name을 변경, 조회하는 메서드 구현
      // - 메서드를 통해 name과 id 출력
      // - 메서드를 통해 pw를 변경
      //3)학생 모든 정보를 출력하는 메서드를 studentList에 작성하고
      //출력하기
      
      class_studentList list = new class_studentList();
      class_student student = new class_student();

      for(;;) {
         System.out.println("이름, id, pw를 순서대로 입력하시오");
         student = new class_student(scan.nextLine(), scan.nextLine(), scan.nextLine());
         student.getInfo();
         System.out.println("위 정보로 입력하시겠습니까? y/n");
         if(scan.nextLine().equals("y")) {
            list.addStudent(student);
         }
         System.out.println("학생 정보를 더 입력하시겠습니까? y/n");
         if(scan.nextLine().equals("n")) {
            break;
         }
      }
      
      list.viewStudentList();
      
      System.out.println("비밀번호를 변경하시겠습니까?");
   }

}