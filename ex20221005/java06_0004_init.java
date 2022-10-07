package com.human.ex20221005;

import java.util.ArrayList;
import java.util.Scanner;

public class java06_0004_init {

   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
      // example0001. 날짜별 날씨를 저장하는 클래스를 만들고,
      // 요일별로 날짜 저장하는 배열을 만드시오
      // 1)날짜와 날씨를 저장하는 클래스 : 날짜, 날씨 필드값 필요
      // 2)요일별로 날짜 저장하는 배열 : 요일 : 1,2,3,4,5...
      // 예)arrayList<class_weather>에 인스턴스를 지속적으로 넣어서
      // 1주일 중 주중(5일)을 채우면 배열을 출력하시오

      // =(대입연사자) 우측에 인스턴스 만들어서(new)
      // 좌측 weaterLog 변수에 할당(저장)
//      class_weather weatherLog_1 = 
//            new class_weather("흐림", "2");
//      //생성자를 통해서 인스턴스를 만들면,
//      //생성자에 무언가 작업을 해서 다양한 스타일로 만들 수 있지 않을까?
//      //= 매개변수를 통한 인스턴스 다양성 : 오버로딩(overloading)
//      class_weather weatherLog_2 = 
//            new class_weather("비옴", "3");
//      
//      //오버로딩 : 생성자 스타일을 다양하게 만들기
//      class_weather weatherLog_3 = 
//            new class_weather("4");
//      class_weather weatherLog_4 = 
//            new class_weather("맑음","5","오후");
//      class_weather weatherLog_5 = 
//            new class_weather("맑음","6","오전");
//      
//      ArrayList<class_weather> log = new ArrayList<>();
//      
//      log.add(weatherLog_1);
//      log.add(weatherLog_2);
//      log.add(weatherLog_3);
//      log.add(weatherLog_4);
//      log.add(weatherLog_5);
//      
//      String[] test = {"김준석","이준석","박준석"};
//      
//      //향상된 for문
//      //조건절 (타입 변수명 : 배열변수명)
//      for(class_weather i:log) {
//         System.out.println(i.weatherLog);
//         System.out.println(i.day);
//         System.out.println(i.time);
//      }
//
//      for(String i:test) {
//         System.out.println(i);
//      }
//      

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
//      int start_time;
//      int end_time;
      // toDoList 인스턴스를 담는 배열
      ArrayList<class_toDoList> addList = new ArrayList();

      // 계속 데이터를 받아서 인스턴스를 찍어내고, 배열에 저장하는 무한 반복문
      for (;;) {
         // 키보드로 받는 데이터를 temp_toDo변수에 저장
         temp_toDo = scan.nextLine();
         temp_day = scan.nextInt();
//         start_time = scan.nextInt();
//         end_time = scan.nextInt();
         // nextInt()로 숫자만 받고, enter키가 버퍼에 남아 있는 것을
         // 청소하기 위해서 nextLine()메서드 실행
         scan.nextLine();

         // if()조건절 안에는 true가 되어야, {}코드 영역 실행
         // temp_day != 0 : temp_day의 값이 0이 아니여야 한다
         // temp_toDo.equals(null) : temp_toDo변수의 값이
         // null일 경우의 반전(!) : null 아닐 경우

         // if문 조건이 성립되면 temp변수를 선언해서
         // class_toDoList 인스턴스를 만들어 temp변수에 할당
         // 단, 생성자에게 필요한 인자값
         // temp_day, temp_toDo를 전달하고 인스턴스를 생성
         class_toDoList temp = new class_toDoList(temp_day, temp_toDo);
         addList.add(temp);

         // addList 배열 안에 있는 class_toDoList 인스턴스를 하나씩
         // 꺼내서 출력하는 향상된 반복문
         for (class_toDoList item : addList) {
            // 인스턴스 안에 있는 getToDO()메서드를 실행하여
            // return 값을 sysout으로 출력
            System.out.println(item.getToDo1());
         }
      }

      // 1-4. 지난 문제인 학생목록 class안에 toDoList class를 안에 넣어
      // 관리시스템을 구성하시오
      // (다중 인스턴스 생성, 참조객체 자유구사, 인스턴스 관리)

      // 1-5.
      // (instanceOf를 사용하여 객체를 구분)

   }

}