package com.human.ex20221005;

public class class_toDoList {
   //날짜, startTime, endTime, 할일
   //private 객체를 캡슐화, 은닉화 시키기 위해
   //외부 클래스 혹은 메서드에서 본 클래스를 접근하지 못하게 접근제한자 선언
   private int day;
   private String toDo;
   private int startTime;
   private int endTime;
   
   //오버로딩
   //매개변수 갯수, 순서, 타입에 따라서 여러가지 스타일의 인스턴스를
   //만드는 기술 (다형성 : 다양하게 형태를 구성하는 것)
   public class_toDoList(int day, String toDo 
         ) {
      this.day = day;
      this.toDo = toDo;
      this.startTime = 9999;
      this.endTime = 9999;
   }
   class_toDoList(int day, String toDo, int startTime, int endTime
         ) {
      this.day = day;
      this.toDo = toDo;
      this.startTime = startTime;
      this.endTime = endTime;
   }
   
   //*제시한 시간이 startTime과 endTime 사이에 있는지 확인하는 메서드   
   public boolean checkBetweenTime(int input_time) {
      //A && B : A도 참이고, B도 참이여야 참으로 반환(해석) 
      //A || B : A가 참이거나, B가 참이면 참이다 (둘 중 하나만 참) = 참
      if(this.startTime <= input_time
            && this.endTime >= input_time) {
         return true;
      }
      return false;
   }
   
   //오늘의 할일이 맞는지 확인하는 메서드
   //A.contains(B) : 문자열 중 B의 값이 A에 들어있는지 확인
   public boolean checkToDo(String input_todo) {
      if(toDo.contains(input_todo)) {
         return true;
      }else {
         return false;
      }
   }
   
   //날짜를 확인하는 메서드
   public boolean checkDay(int input_day) {
      if(input_day == this.day) {
         return true;
      }
      return false;
   }
   
   //할일 출력 메서드
   private String getToDo() {
      return this.toDo;
   }
   
   private int getDay() {
      return this.day;
   }
   private int getStartTime() {
      return this.startTime;
   }
   private int getEndTime() {
      return this.endTime;
   }
   
   public String getToDo1() {
      return getToDo()+getDay()+getStartTime()+getEndTime();
   }


}