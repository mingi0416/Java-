//package 자바 파일(코드)가 하나의 덩어리로 묶여있는 영역 (class 덩어리)
package com.human.ex20221004;

//import 현재 있는 class 내부에서 외부에 있는 자바 파일을 읽어올 때
//필요한 선언문 (import = 가져오다)
//java.util.ArrayList; : 자바클래스 내부에 util클래스 내부에
//ArrayList 클래스(객체)를 사용하겠다 -> 자료형 ArrayList를 선언하여
//메모리(heap)에 도구로써 사용 가능 
import java.util.ArrayList;
import java.util.Scanner;

//class 메서드, 변수 등등을 뭉치는 하나의 덩어리 
//*인스턴스를 만들기 위한 설계도
public class java05_0010_studentRandomPosition_createChangeMethod {

   // static 유일한 1개
   // *지역변수, 전역변수, 매개변수 이름은 중복되면 안됩니다
   // 전역변수, 지역변수 동일한 변수 이름이면 지역변수를 호출한다
   // 메서드 내부에서 변수 호출시 가장 가까운 변수를 먼저 찾고 호출한다
   // 변수 호출 시 이름이 동일하지 말아야 하나,
   // 지역변수, 전역변수 호출 위치를 알수 있다면 다른 변수라고 인식 가능하므로
   // 지역변수와 전역변수 이름이 동일해도 가능(가능은 함)
   // = 같은 코드영역{}에 동일한 이름만 아니면 됨
   // studentNumArray 변수
   // ArrayList<String> : 가변배열 : 배열의 길이가 늘어날 수 있음
   // <-> String[] : 고정배열
   // <String> : 이 배열에 칸 안에는 String타입 데이터만 들어갈 수 있다
   // 메모리 stack 영역에 선언이 되어 존재
   // = 대입연산자 우측
   // new ArrayList<>(); : arrayList타입으로 도구를 "새로" 만듬
   // 대입연산자 좌측에 있는 변수(메모리 stack영역) studentNumArray에
   // 할당(저장)
   static ArrayList<String> studentNumArray = new ArrayList<>();
   static ArrayList<String> positionArray = new ArrayList<>();
   // ArrayList 배열에는 참조타임이 값으로 들어갈 수 있다
   // 참조타입이면 다 가능하다 (=배열도 참조타입으로 가능)
   // ex) 배열 3번째 칸에 또 다른 배열이 있다
   static ArrayList<ArrayList<String>> pixPositionArray = new ArrayList<>();

   static ArrayList<Integer> logData = new ArrayList<>();
   static boolean iAmSoloCheck = true;
   // Scanner 선언된 타입
   // = new Scanner(System.in); : Scanner도구를 새로 만들어서
   // 좌측 변수에 할당(저장)
   // System.in : 인자값으로 활용 : 키보드, 마우스 등 프로그램 외부와 소통
   // 하기 위한 통로
   static Scanner scan = new Scanner(System.in);

   // 전역변수 num01 선언하고 데이터 할당(저장)
   static String num01 = "권지혜";
   static String num02 = "김건희";
   static String num03 = "김민기";
   static String num04 = "김정환";
   static String num05 = "김지희";
   static String num06 = "김현중";
   static String num07 = "박경환";
   static String num08 = "박송헌";
   static String num09 = "박유진";
   static String num10 = "박주성";
   static String num11 = "성진현";
   static String num12 = "심규태";
   static String num13 = "양희수";
   static String num14 = "이도연";
   static String num15 = "이우창";
   static String num16 = "이재형";
   static String num17 = "이준배";
   static String num18 = "이지훈";
   static String num19 = "이진수";
   static String num20 = "장민욱";
   static String num21 = "정윤호";
   static String num22 = "정하륜";
   static String num23 = "조은빈";
   static String num24 = "허영주";

   // main() 자바 프로그램이 실행되는 시작점 (런타임 시점)
   // 1. 컴파일 : 자바코드를 실행할 수 있는 바이트코드로 변환
   // 000.java -> (컴파일) -> 000.class
   // .class 파일은 jvm이 OS환경에서 돌릴 수 있는 실행 파일
   // 2. 런타임 : .class파일을 실행하여 동작하는 행위
   // 컴파일 에러, 런타임 에러~
   // 컴파일 에러 : 코드자체 문법이 문제 있다
   // 런타임 에러 : 코드실행에러 또는 OS에러 또는 메모리 누수 에러...

   // public : 모든 클래스가 접근 가능한 메서드 <->
   // private : 같은 클래스 내부에서만 접근 가능한 메서드
   // main() 메인메서드는 jvm에서 실행(외부에서 실행)하므로
   // 공개되어야 실행 가능 = public으로 해야 검색 혹은 실행 가능
   // void 리턴이 없음 <-> String, int.. 등등 타입 선언
   // (String[] args)
   // 메인메서드가 실행될 때 외부에서 받는 문자열(명령어)를 받기 위한
   // 매개 변수
   public static void main(String[] args) {
      while (iAmSoloCheck) {
         // 초기 배열 선언 및 값 대입
         // init() : main메서드 밖에 있는 init()메서드 실행
         // (24, "-") : init()메서드 실행 할 때
         // 선물로 24, 문자열 "-"를 전달
         init(24, "-");
         // 랜덤으로 포지션 지정 및 저장 메서드
         randomPostionSort();
         // 자리 출력 메서드
         view_position();
         // 선점 자리 수정 메서드
         fixPositionInit();
         // [작성해야 할 메서드]
         condition_center();
         // 콘솔 창 출력
//      delay();
         // 자리 출력 메서드
         view_position();
         testView();

         // 3-1 자리 재배치를 했을 때 본인의 자리가 몇 번이었는지
         // 기록을 남기고 출력하시오
      logData();
      System.out.println(logData);

         // 3-2 혼자자리 출력될 때까지 반복
         checkSoloPosition();
      }
   }

   private static void checkSoloPosition() {
      if (positionArray.get(23).equals("권지혜")) {
         iAmSoloCheck = false;
      }else {
         positionArray.clear();
         studentNumArray.clear();
         pixPositionArray.clear();
      }
   }

   private static void logData() {
      // TODO Auto-generated method stub
      for (int i = 0; i < positionArray.size(); i++) {
         if (positionArray.get(i).equals("권지혜")) {
            logData.add(i);
         }
      }

   }

   private static void delay() {
      for (int i = 0; i <= 5; i++) {
         for (int j = 0; j < i * 3; j++) {
            if (i % 2 == 0) {
               System.out.print("☝");
            } else {
               System.out.print("✌");
            }
         }
         System.out.println("[" + ((i * 100) / 5) + "%]");
         delay_log();
      }
   }

   private static void testView() {
      String[] view = new String[20];
      for (int i = 0; i < 20; i++) {
         if (i % 4 == 0) {
            view[i] = "😝";
         } else if (i % 3 == 0) {
            view[i] = "😁";
         } else if (i % 2 == 0) {
            view[i] = "😓";
         } else {
            view[i] = "😱";
         }
      }
      for (int i = 0; i < 20; i++) {
         System.out.print(view[i]);
         if (i % 10 == 0 && i != 0) {
            System.out.println();
         }
      }

   }

   private static void delay_log() {
      try {
         Thread.sleep(1500);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   private static void condition_center() {
      // 복도? 위치에 있는 자리 배열
      int[] centerPosition = { 1, 2, 6, 7, 11, 12, 16, 17, 20, 21 };

      // 본인이 2번째 줄에 있지 않으면, (5~10)
      // 7번째 칸에 본인의 이름을 넣고
      // 그 뒤에 있는 학생들의 위치를 1씩 미루시오

   }

   private static void fixPositionInit() {
      // 각 줄에 2명씩 들어감 (단, 각 그룹에 1명씩)
      // 예) (0,1)에 한 명, (2,3,4)에 한 명
      // (5,6)에 한 명, (7,8,9)에 한 명..
      // 학생이름과 위치를 저장하기 위한 배열
      ArrayList<String> addArray1 = new ArrayList<>();
      // 처음에 수정될 위치 추가
      // add() : 가변배열에 값을 추가
      addArray1.add("김건희");
      addArray1.add("5");
      // 배열을 담는 2중 배열인
      // pixPositionArray에 addArray1배열을 추가
      pixPositionArray.add(addArray1);
      //
      ArrayList<String> addArray2 = new ArrayList<>();
      // 처음에 수정될 위치 추가
      addArray2.add("김정환");
      addArray2.add("23");
      pixPositionArray.add(addArray2);
      //
      ArrayList<String> addArray3 = new ArrayList<>();
      // 처음에 수정될 위치 추가
      addArray3.add("박송헌");
      addArray3.add("8");
      pixPositionArray.add(addArray3);
      //
      ArrayList<String> addArray4 = new ArrayList<>();
      addArray4.add("이도연");
      addArray4.add("1");
      pixPositionArray.add(addArray4);

      ArrayList<String> addArray5 = new ArrayList<>();
      addArray5.add("이우창");
      addArray5.add("17");
      pixPositionArray.add(addArray5);

      ArrayList<String> addArray6 = new ArrayList<>();
      addArray6.add("이준배");
      addArray6.add("12");
      pixPositionArray.add(addArray6);

      ArrayList<String> addArray7 = new ArrayList<>();
      addArray7.add("정하륜");
      addArray7.add("15");
      pixPositionArray.add(addArray7);

      ArrayList<String> addArray8 = new ArrayList<>();
      addArray8.add("조은빈");
      addArray8.add("10");
      pixPositionArray.add(addArray8);

      // 반복문 밖에 변수를 선언하고 재활용하면
      // 새로 메모리를 할당하는 컴퓨터연산을 줄일 수 있는 장점

      // 저장할려는 이름
      String tempName = "";
      // 저장하고 싶은 위치 (본인이 가고 싶은 칸 위치)
      int tempIndex = 0;
      // 본인의 있는 위치
      int beforeIndex = 0;
      // pixPositionArray : 강제적으로 위치를 지정받는
      // 이름과, 포지션위치를 담고 있는 배열을 담고있는 배열
      for (int i = 0; i < pixPositionArray.size(); i++) {
         System.out.println(pixPositionArray.get(i));
         tempName = pixPositionArray.get(i).get(0);
         // Integer.parseInt : String 문자열을 int로 변환
         tempIndex = Integer.parseInt(pixPositionArray.get(i).get(1));

         // 배열에 있는 학생이름의 index값을 beforeIndex 변수에 저장
         for (int k = 0; k < positionArray.size(); k++) {
            if (positionArray.get(k).equals(tempName)) {
               beforeIndex = k;
            }
         }
//         System.out.println(tempName);
//         System.out.println(tempIndex);
//         System.out.println(beforeIndex);
         // 서로 위치 교환
         positionArray.set(beforeIndex, positionArray.get(tempIndex));
         positionArray.set(tempIndex, tempName);

      }

   }

   private static void randomPostionSort() {
      String tempName = "";
      int randomNumber = 0;
      // positionArray.size(); : 배열의 길이 (칸이 몇개?)
      for (int i = 0; i < positionArray.size(); i++) {
         // if문은 조건문으로
         // 조건이 성립되면 {}코드 영역 실행, 아니면 pass
         // positionArray.get(i).equals("-")
         // A.equals("-") : A와 "-"비교해서 같으면 true
         // positionArray.get(i) : 배열의 i번째 값을 가져옴(get)
         if (positionArray.get(i).equals("-")) {
            for (;;) {
               // = random_count0_24();
               // 메서드 실행되고 return 된 값이
               // randomNumber 변수에 할당 저장
               randomNumber = random_count0_24();
               // 랜덤으로 받은 숫자를 활용해서
               // randomNumber : 0~23사이의 숫자
               // studentNumArray.get(randomNumber)의 인자값으로 사용
               // studentNumArray의 몇 번 째 칸(랜덤)에 있는
               // 값을 가져옴
               tempName = studentNumArray.get(randomNumber);
               if (!tempName.equals("-")) {
                  // set : 덮어쓰기
                  // get : 가져오기
                  // A.set(i, "김준석")
                  // A배열의 i번째 칸에 "김준석" 문자열을 덮어쓴다
                  // = 기존에 i번째 칸에 있는 학생이름은 없어짐
                  positionArray.set(i, tempName);
                  studentNumArray.set(randomNumber, "-");
                  // break; : 가장 가까운 반복문 종료
                  break;
               }
            }
         }
      }
   }

   // 선물받은 24, 문자열 "-"를 지역변수로 담을 수 있는
   // 변수 number와 string1을 선언하고 각각 변수에
   // 값을 할당 저장 = 매개변수
   private static void init(int number, String string1) {
      // i < number; : i의 값이 매개변수 number보다 작을 때까지
      // 반복문(for) 실행
      for (int i = 0; i < number; i++) {
         // 반복문 실행해서 계속 문자열 "-"를 순차적으로 추가
         // .add()
         positionArray.add(string1);
      }
      studentNumArray.add(num01);
      studentNumArray.add(num02);
      studentNumArray.add(num03);
      studentNumArray.add(num04);
      studentNumArray.add(num05);
      studentNumArray.add(num06);
      studentNumArray.add(num07);
      studentNumArray.add(num08);
      studentNumArray.add(num09);
      studentNumArray.add(num10);
      studentNumArray.add(num11);
      studentNumArray.add(num12);
      studentNumArray.add(num13);
      studentNumArray.add(num14);
      studentNumArray.add(num15);
      studentNumArray.add(num16);
      studentNumArray.add(num17);
      studentNumArray.add(num18);
      studentNumArray.add(num19);
      studentNumArray.add(num20);
      studentNumArray.add(num21);
      studentNumArray.add(num22);
      studentNumArray.add(num23);
      studentNumArray.add(num24);

   }

   private static int random_count0_24() {
      // Math.random() : 0.0.. ~ 0.99.. 사이 수를 랜덤으로 출력
      // 0.00..*25 = 0;
      // 0.99..*25 = 24.99..; 1*25 = 25 -> 1보다 작은 수를 곱하므로
      // 결론적으로 24.99..값이 출력됨!
      // (int) 형변환하므로 소수점 삭제
      // 0~24 숫자(정수) 중에 한 개 출력
      return (int) (Math.random() * 24);
   }

   private static void view_position() {
      System.out.println("[문]--------------------------");
      // j는 배열 칸의 시작이 0부터인 i와 다르게
      // 1부터 시작하여 위치 배열을 인식하기 위한 변수
      int j = 1;

      for (int i = 0; i < positionArray.size(); i++) {
         // 1~3줄의 index값은 0~14이기 때문에
         if (i < 15) {
            // 1줄에 5명씩 앉아 있기 때문에
            // 5로 나누어 떨어지는 수 일경우에는 1줄 띄기 실행
            if (j % 5 == 0) {
               System.out.print(positionArray.get(i) + "/");
               // println() 줄바꿈 출력
               System.out.println();
            } else {
               // print() 줄 바꿈 안하고 출력
               System.out.print(positionArray.get(i) + "/");
            }
            // 3줄이 종료되는 i값 14일 경우
            // 4줄부터 다시 계산하기 위해서 j값을 0으로 초기화
            if (i == 14) {
               j = 0;
            }
            // 15~24까지
         } else {
            if (j % 4 == 0) {
               System.out.printf(positionArray.get(i) + "/");
               System.out.println();
            } else {
               System.out.printf(positionArray.get(i) + "/");
            }
         }
         j++;
      }
      System.out.println();
   }

}