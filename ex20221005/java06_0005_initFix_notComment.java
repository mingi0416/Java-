package com.human.ex20221005;

import java.util.ArrayList;
import java.util.Scanner;

public class java06_0005_initFix_notComment {

   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
      
      // history 20221005
      // 1. 인스턴스와 생성자
      // 2. 생성자(오버로딩)
      // 3. 정보(현실세계 추상적인 개념) 객체화(컴퓨터 프로그래밍화 객체화)
      
      // 1-3. oneDay toDoList를 자유롭게 class를 만드시오
      // 예)날짜, startTime, endTime, 할일
      // (정보 체계화, 참조객체 자유구사, 인스턴스 관리)
      // 1)클래스 toDoList작성
      // 필드선언 : 날짜, 할일, (시작시각, 종료시각)..
      // 2)생성자 만들기
      // 생성자를 통해서 매개변수값을 필드값에 할당(저장)
      // *오버로딩
      // 날짜는 있으나, 할일이나 시각이 없을 경우 (null)에는
      // 자동으로 특정 값을 필드에 저장
      // 3)arrayList배열에 toDoList인스턴스를 add(넣어서)
      // for문으로 출력하시오

      int temp_day;
      String temp_toDo;
      int start_time;
      int end_time;
      ArrayList<class_toDoList> addList = new ArrayList();

      for (;;) {
         System.out.println("할 일을 입력하시오");
         temp_toDo = scan.nextLine();
         System.out.println("날짜를 입력하시오");
         temp_day = scan.nextInt();
         start_time = scan.nextInt();
         end_time = scan.nextInt();
         scan.nextLine();
         class_toDoList temp = new class_toDoList(temp_day, temp_toDo
               , start_time, end_time);
         addList.add(temp);
         
         System.out.println("추가하시겠습니까? Y/n");
         if(scan.nextLine().equals("n")) {
            break;
         }
      }
      
      for (class_toDoList item : addList) {
         System.out.println(item.getToDo1());
         System.out.println(item.checkBetweenTime(13));
      }
   }

}