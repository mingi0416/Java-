package com.human.code20220928;

import java.util.ArrayList;
import java.util.Scanner;

public class T_java05_0007_studentRandomPositionGroup {

   // 동적타입, 정적타입(타입을 정확하게 선언함(Java..))
   // static 변수가 딱 1개만 존재
   // ArrayList<> : 가변배열 타입 선언
   // ArrayList<String> : 가변배열 칸 안에는 String타입만 들어갈 수 있다
   // studentNumArray : 변수 이름 (호출할 때 이름)
   // =(대입연산자) : 우측에 있는 값을 좌측 변수에 할당(저장)
   // new ArrayList<>(); : ArrayList도구를 새로 만들어서 좌측에 저장
   // 좌측 타입과 우측 도구(타입)은 동일해야 함
   // 간략화 : String abc = "김준석";
   // 원본 : String abc = new String("김준석");
   static ArrayList<String> studentNumArray = new ArrayList<>();
   static ArrayList<String> positionArray = new ArrayList<>();

   
   static Scanner scan = new Scanner(System.in);
   
   static String num01 = "김준석";
   static String num02 = "김건희";
   static String num03 = "김민기";
   static String num04 = "김정환";
   static String num05 = "김지희";

   // 위에까지 내용(변수들..)은 필드로써 여러가지 메서드들이 접근하여
   // 저장 혹은 수정을 할 수 있음

   private static void test() {
      System.out.println(num02);
   }

   private static void fix() {
      num02 = "박준석";
   }

   public static void main(String[] args) {

      // history 20220927
      // 1. 전역변수 : 클래스 아래에 위치하고 있고,
      // 모든 메서드에서 데이터를 저장하고, 바꿀 수 있는 변수
      // 2. 지역변수 : 메서드 또는 for문 내 {}코드내에서만 사용하고
      // 소멸하는 변수 ({}코드 밖에서 호출할 수 없다!)
      // 3. 매개변수 : 메서드 호출할 때 인자값을 전달하면
      // 메서드 내에서 그 값을 사용할 수 있도록 저장하는 변수
      // (매개체+변수)

//      String num01 = "김준석";
      // num01 은 전역변수(필드), 지역변수(메서드 안에 선언된 변수)
      // 모두 같은 이름인데, 호출 할 때는 지역변수로 호출 됨

      // 호출되는 시점에서 가장 가까운 변수를 가져옴
//      System.out.println(num01);

      // 메서드 안에서 필드 값을 바꿀 수 있음
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)
//      fix(); // fix()메서드를 가져와서 실행 (num02 전역변수 값을 박준석으로 바꿈)
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)

      // 1)만약 positionArray 배열의 길이를 10으로 늘리고 싶다면
      // init()메서드를 어떻게 수정하시겠습니까?
      // ex)인자값, 매개변수 활용해서 만들어보세요~
      // 2)init()메서드를 사용하여
      // positionArray 배열의 길이는 12이고,
      // 안에 값은 (칸마다) 김준석1, 김준석2, 김준석3... 김준석12까지 들어가도록
      // 수정해보세요~
      // ex)인자값, 매개변수 사용하시고, (문자열+숫자) 사용하세요
      // 1. 변수는 1개 데이터만 담을 수 있다
      // 2. 매개변수는 각 데이터를 담아서 메서드에서 사용할 수 있다
      // 3) init()메서드를 사용하여
      // positionArray 배열의 길이는 25칸이고, 안에 값은 "-"넣는다
      // 단, positionArray의 13번째 칸에 본인의 이름을 넣어서 출력하시오
      // ex)if문을 써서 특정 i의 값이되면 본인의 이름을 넣도록 코드를 작성!
      // if(i==13) > positionArray.add("본인이름");
      // 4) init()메서드를 사용하여
      // positionArray 배열의 길이는 25칸이고, 안에 값은 "-"넣는다
      // 단, 배열의 짝수 일 때에는 "~"표시로 저장하시오
      init(5, "-");
      // positionArray.size() : arrayList배열의 칸 길이를 알려줌
      // intList.length : 고정배열의 칸 길이를 알려줌
      System.out.println(positionArray.size());
      for (int i = 0; i < positionArray.size(); i++) {
//         positionArray.get(i) : positionArray 배열의
         // i번 째 칸의 값을 가져오겠다! (get!)
         System.out.println(positionArray.get(i) + ":" + i);
      }

      String tempName = "";
      int randomNumber = 0;

      // for문 : 반복문 : 특정 조건이 성립할 때까지 코드{}를 반복하겠다!
      // 조건절 : i < positionArray.size(); :
      // i의 값이 positionArray.size(); 크기보다 작을 때까지!
      for (int i = 0; i < positionArray.size(); i++) {
         // if(조건식) : 조건식이 true일 때 코드{} 실행
         // positionArray.get(i).equals("-")
         // positionArray 배열의 i번째 칸의 값이 "-"과 같으면(equals)
         // A.equals("-") : 문자열"-"과 A의 값을 비교하겠다!
         // positionArray.get(i) : 배열의 i번째 값을 가져오겠다(get)
         // equals() 메서드를 쓰면 비교에 따라서 같으면 true,
         // 다르면 false가 반환됨(result:결과값)
         if (positionArray.get(i).equals("-")) {
            // 반복문 for(;;) : 조건이 없음 -> 무한 반복
            for (;;) {
               // random_count0_24(); 메서드를 실행하여 결과값을
               // randomNumber 변수에 할당(저장)
               randomNumber = random_count0_24();
               // studentNumArray 배열에 ?번째 값을 출력
               // ? = randomNumber으로 랜덤으로 값을 출력한 정수
               // tempName변수에 학생이름을 저장
//               studentNumArray = 배열(전역변수)
               tempName = studentNumArray.get(randomNumber);
               // tempName.equals("-") :
               // tempName변수 값이 "-"이면 true
               // 그 true의 값을 !(반전)을 하면 false
               // 그러므로 if문 조건이 성립되지 않는다!
               if (!tempName.equals("-")) {
                  // 위에 조건이 성립되면
                  // tempName 변수값은 학생 이름이고
                  // teamName을 positionArray 배열의 i번째 칸에 저장
                  // A.set(i, tempName)
                  // A배열의 i번째 칸에 tempName변수 값을 저장
                  positionArray.set(i, tempName);
                  studentNumArray.set(randomNumber, "-");
                  break;
               }
            }
         }
      }
      view_position(positionArray);

//      System.out.println("-------Q.1-1-------");
//      // 1-1. 본인의 자리가 맨 앞자리가 아니면 맨 앞자리로 바꾸는 기능을 구현하시오
//            //1)본인의 이름을 equals로 검색하고, 
//            //positionArray 배열의 위치가 0번째가 아니면, 
//            //0번째로 바꾸시오
//            //2)그리고, 0번째에 있던 친구의 이름을 전에 있던 본인의 위치로 이동하시오 
//      //positionArray.get(0) : 0번째 배열의 값을 출력
//      //출력된 값을 equals()메서드로 비교
//      if(positionArray.get(0).equals("김준석")) {
//         System.out.println("권지혜씨는 0번째 위치 입니다");
//      }else {
//         //요구사항을 명확하게 판단
//         //본인의 이름이 있는 배열 칸의 위치
//         //for문으로 본인이름이 있는 위치를 측정(i)
//         //0,바꿀사람 <-> 배열위치,본인이름
//         System.out.println("권지혜씨는 0번째 위치 아닙니다");
//         //본인이름이 있는 배열위치를 저장하는 변수
//         int checkPosition = 0;
//         for(int i = 0; i<positionArray.size();i++) {
//            if(positionArray.get(i).equals("김준석")) {
//               //본인의 이름이 있는 배열 칸의 위치 저장
//               checkPosition = i;
//            }
//         }
//         //1. 바꿀사람의 이름은 0번째에 고정되어 있으므로
//         //먼저 본인 위치에 바꿀 사람의 이름으로 교체하여 저장
//         positionArray.set(checkPosition, positionArray.get(0));
//         //0번째 배열에 본인 이름 넣기
//         positionArray.set(0, "김준석");
//      }
//      
//      view_position(positionArray);

      System.out.println("-------Q.1-2-------");
      // 1-2. 본인의 자리가 우측이면 좌측으로 바꾸는 기능을 구현하시오
      // 1)본인의 이름을 찾는다 -> 배열의 i값(칸의 위치) 찾을 수 있음
      // if(positionArray.get(i).equals("김준석"))
      int checkIndex = 0;
      // i<positionArray.size(); : 반복문은 positionArray.size()
      // 보다 작을 때까지 반복하겠다
      for (int i = 0; i < positionArray.size(); i++) {
         // 조건문
         // positionArray.get(i).equals("김준석")
         // "김준석" 이라는 문자열
         // A.equals(B); A와 B 문자열을 비교한다
         // positionArray.get(i)
         // positionArray 배열의 i번째 칸에 있는 값을 꺼낸다
         // 비교하면 맞다, 다르다 라는 문구가 출력되므로
         // true, false로 출력
         if (positionArray.get(i).equals("김준석")) {
            // =(대입연산자) 우측에 있는 값을 좌측 변수에 할당(저장)
            checkIndex = i;
         }
      }
      System.out.println(checkIndex);
      // 2)배열은 0부터 시작하므로 짝수이면 좌측
      // 홀수이면 우측이므로
      // 홀수 칸 위치이면 짝수 칸으로 바꾸는 코드 작성하시오

      // 나누기를 해서 나눌 수 없는 값을 나머지
      // ex) 5/2 = (2*2)+1 : 1은 나머지
      // 8/3 = (3*2)+2 : 2는 나머지
      // heckIndex%2 : % 나머지를 구하는 코드
      // 나머지가 1이면 항상 홀수
      // 나머지가 없으면 항상 짝수
      // != 값이 아니면 -> 성립이 되면 true(사실)
      if (checkIndex % 2 != 0) {
         // positionArray.set(1, "ABC")
         // positionArray 배열의 1번째 칸에 "ABC"문자를 덮어쓴다(Setting)
         // checkIndex 번째 칸에
         // positionArray.get(checkIndex-1) 값을 저장
         // "김준석" 단어가 있는 배열 칸 바로 앞에(-1) 있는 학생의 이름을 저장
         // "김준석" 이라는 단어는 알고 있으나,
         // 바로 앞에 있는 학생의 이름을 모르고 있으니,
         // 먼저 모르는 학생의 이름을 checkIndex 배열 위치에 저장 한 뒤에
         // 알고 있는 "김준석"이라는 이름을 후에 저장을 한다
         positionArray.set(checkIndex, positionArray.get(checkIndex - 1));
         positionArray.set(checkIndex - 1, "김준석");
      }
      view_position(positionArray);

      // 3)홀수는 선택의 여지가 3개입니다
      // 단, 자기 줄수 위치에서 좌측으로 바꾸시오
      // 예)본인 위치가 배열의 4번째(i=3)이면
      // 2번째 줄이므로 (0,1(첫번째 줄), 2,3(두번째 줄)
      // i를 3에서 2로 바꿉니다. (두번 째 줄 우측에서 좌측 자리로 바꿈)

      
      System.out.println("-------Q.1-3-------");
      
      // 1-3. 본인의 자리가 홀로 자리이면 짝궁이 있는 자리로 바꾸는 기능을 구현하시오
      // 1) 홀로있는 자리 = 배열의 칸이 마지막인 4 (5번째)인지 확인
      // 2) 짝궁이 있는 자리 0,1 또는 2,3 자리로 이동이 가능하고
      // 선택을 할 수 있는 scanner 기능을 사용하시오
      
      int checkIndexQ1_3 = 0;
      for (int i = 0; i < positionArray.size(); i++) {
         if (positionArray.get(i).equals("김준석")) {
            checkIndexQ1_3 = i;
         }
      }
      System.out.println(checkIndexQ1_3);

      // positionArray.size()-1 : 배열의 크기는 1부터 계산되어 5라는 숫자가 출력
      // 그러므로 0부터 시작하는 배열의 위치는 -1이여야 마지막 배열 위치라고 할 수 있다
      // 1 == 1 숫자끼리 비교해서 동일하면 true
      if (checkIndexQ1_3 == positionArray.size() - 1) {
         System.out.println("당신은 홀로 앉고 있습니다, 자리를 바꾸시겠습니까?");
         System.out.println("1. 네 || 2. 아니오");
         int check = scan.nextInt();
         scan.nextLine();
         if (check == 1) {
            System.out.println("어느 위치로 자리를 바꾸시겠습니까?");
            System.out.println("0. 좌측 앞에");
            System.out.println("1. 우측 앞에");
            System.out.println("2. 좌측 2번째열");
            System.out.println("3. 우측 2번째열");
            int checkPosition = scan.nextInt();
            scan.nextLine();

            switch (checkPosition) {
            case 0:
               positionArraySet(positionArray.size() - 1,
                     checkPosition,
                     "김준석"
                     );
               break;
            case 1:
               positionArraySet(positionArray.size() - 1,
                     checkPosition,
                     "김준석"
                     );
               break;
            case 2:
               positionArraySet(positionArray.size() - 1,
                     checkPosition,
                     "김준석"
                     );
               break;
            case 3:
               positionArraySet(positionArray.size() - 1,
                     checkPosition,
                     "김준석"
                     );
               break;
            default:
               System.out.println("번호를 잘못눌렀습니다");
               break;
            }
         }
      }
      
      view_position(positionArray);

      
      System.out.println("-------Q.1-4-------");
      
      // 1-4. 본인의 자리가 첫 번째이면 마지막으로 바꿀 수 있는 기능을 구현하시오
      // 1) 배열의 위치를 바꾸는 코드를 구현하되, 배열의 길이가 얼마가 되든
      // 마지막으로 바꿀 수 있는 메서드(기능)을 구현하여 적용하시오
      // hint. 배열의 마지막 길이를 측정할 수 있는 값
      // positionArray.size()를 사용하시오
      
      switchArray(positionArray.size() - 1, "김준석");

      // 2-1. 본인의 이름을 임의로 바꿀 수 있는 기능(메서드)을 구현하시오
      // 메서드 실행 -> 특정 이름 검색 -> 동명이인일 경우를 고려
      // 1) 본인의 이름을 검색할 수 있는 if문과 scanner를 사용하여
      // 변수에 저장 할 수 있는 기능을 추가하시오
      // 2) 동명이인 일경우는 어떻게 처리할지 생각하시오
      // hint1. ArrayList<ArrayList<String> 타입 또는
      // ArrayList<String[] 타입에 대해 구글링하시오
      
      searchName("김준석");
      
      ArrayList<ArrayList<?>> test = new ArrayList<>();
      
      ArrayList<String> arr1 = new ArrayList<>();
      ArrayList<String> arr2 = new ArrayList<>();
      ArrayList<String> arr3 = new ArrayList<>();
      ArrayList<Integer> arr4 = new ArrayList<>();
      
      arr1.add("김준석1");
      arr1.add("김준석2");
      arr2.add("박준석1");
      arr2.add("박준석2");
      arr4.add(2);
      arr4.add(5);
      
      test.add(arr1);
      test.add(arr2);
      test.add(arr3);
      test.add(arr4);
      
      System.out.println(test.get(0).get(0));
      System.out.println(test.get(1).get(1));
      
      for(int i =0; i<test.size(); i++) {
         System.out.println(i+" : "+test.get(i));
      }
      
      //예제) 김준석1의 id는 abcd1 이고 pw 12341234이다
      //김준석2의 id는 abcd2 이고 pw 123qq이다
      //김준석3의 id는 abcd55 이고 pw 123aa이다
      //이것을 저장하는 배열을 만들어 보시오
      
      ArrayList<ArrayList<String>> saveAccount = new ArrayList<>();
      
      ArrayList<String> account1 = new ArrayList<>();
      account1.add("김준석1");
      account1.add("abcd1");
      account1.add("12341234");
      account1.add(Long.toString(System.nanoTime()));
      
      ArrayList<String> account2 = new ArrayList<>();
      account2.add("김준석2");
      account2.add("abcd2");
      account2.add("123qq");
      account2.add(Long.toString(System.nanoTime()));
      
      ArrayList<String> account3 = new ArrayList<>();
      account3.add("김준석3");
      account3.add("abcd55");
      account3.add("123aa");
      account3.add(Long.toString(System.nanoTime()));
      
      saveAccount.add(account1);
      saveAccount.add(account2);
      saveAccount.add(account3);
      //id가 abcd55인 사람의 이름을 출력하시오
      for(int i = 0; i<saveAccount.size(); i++) {
         if(saveAccount.get(i).get(1).equals("abcd55")) {
            System.out.println("abcd55 는 "+i+"번째 배열에 있습니다");
         }
      }
      
      // hint2. 데이터 입력시간은 동일 할 수 없는 이유에 대해 생각해보세요
      // 컴퓨터는 순차적으로 일을 처리하므로, 코드 한 줄씩 실행할 때마다
      // 그 순서는 명확해진다 -> 다른 줄의 코드는 각각 다른 시간에 실행된다
      // -> 변수는 동일한 시간에 선언되고 저장될 수 없다
      // 

      // 2-2. 임의의 학생을 추가하여 자리를 재배치 할 수 있는 기능을 구현하시오
      // 1) 배열의 위치를 1개씩 뒤로 밀어서 학생이름을 저장하시오
      // ex) i번째에 "김준석", i+1번째에 "박준석", i+2번째에 "이준석"이라면
      // i+1번째에 "김준석", i+2번째에 "박준석", i+3번째에 "이준석" 덮어쓰기(혹은 추가)
      // 2) 특정 위치 (i칸)에 임의의 학생이름을 덮어써서 저장하시오

      // 3-1. 자리 재배치를 했을 때 본인의 자리가 몇 번이었는지
      // 기록을 남기고 출력하시오
      // ArrayList<String> logData = new ArrayList<>();
      // logData.add(dataText);

      // 3-2. 자기는 혼자 자리를 앉는지 확인하는 메서드를 만들고,
      // 만일 혼자 자리가 아니면, 자리를 재배치 하도록 코드를 구현하시오
      // 1)랜덤으로 자리를 뽑는 코드를 메서드화 시키고, 
      // 특정 조건이 되면 (만일 혼자 자리가 아니면) 메서드 실행하는 코드 작성

   }

   private static void searchName(String name) {
      //1개이면 1사람, 2개이상이면 동명이인..
      int count = 0;
      for(int i=0; i<positionArray.size(); i++) {
         if(positionArray.get(i).equals(name)) {
            count++;
         }
      }
      if(count==1) {
         //사람이름 바꾸기 메서드
         changeName(name);
      }else if(count>1) {
         //동명이인
         //아래 메서드는 모든 이름을 바꾸게 됩니다! 
         //특정 동명이인만 바꿀 수 있도록 기준과 코드를 구현하시오
         //기준 : 이름을 입력한 순서(날짜, 시간)으로 정렬하여 구분..
         changeName(name);
      }
      
   }

   private static void changeName(String name) {
      System.out.println("바꾸고 싶은 이름을 입력하시오");
      String temp = scan.nextLine();
      for(int i = 0; i<positionArray.size(); i++) {
         if(positionArray.get(i).equals(name)) {
            positionArray.set(i, temp);
         }
      }
      
   }

   private static void switchArray(int i, String string) {
      //i : 마지막 배열에 위치
      //string : 본인이름
      positionArray.set(0, positionArray.get(i));
      positionArray.set(i, string);
      
   }

   // private : 접근제한자로써 int()메서드는 같은 class내에서만 쓸 수 있음
   // 예) 여기 클래스에서 여러 메서드들이 있는데, 클래스 내부에서만 쓸 수 있고,
   // 외부 클래스(다른 자바파일 등등..)에서는 init()메서드를 호출하여 쓸 수 없음
   // <> public
   // static : 한 개만 있음! <> 인스턴스
   // void : 메서드를 실행하면 return 값이 없음
   // 예) String abc = init(); (x) init()메서드는 void이므로
   // abc변수에 무언가의 값을 저장 할 수 없음
   // (int money) : 매개변수
   // 데이터를 전달하여 받는 매개체+변수 (매개변수)
   // (int money = 30);
   // int money 타입과 변수이름으로 선언 = 10;
   private static void init(int number, String string1) {
      // 초기식 : int i = 0;
      // 조건식 : i < 5; (for문 돌 때마다 i의 값을 확인하는데
      // 5보다 작을 때까지 for은 계속 돈다!)
      // 증감식 : i++ : for문 한 번 돌때마다 i의 값은 1씩 증가
      for (int i = 0; i < number; i++) {
         // 전역변수 positionArray 배열에 순서 대로
         // 0번째 배열칸에 "-" 추가(add)
         // 1번째 배열칸에 "-" 추가(add)
         // 2번째 배열칸에 "-" 추가(add)...
         // 매개변수 name의 값을 add()로 저장
         // name+(i+1) : i는 숫자, 1도 숫자, name은 문자열
         // 문자열이 우선순위 형변환이므로
         // 좌측 name변수 타입으로 모두 변환되어 출력
         // ex) 김준석51
         // ()괄호를 써서 숫자 연산부터 한 뒤에 name(문자열)으로 같이 형변환

         positionArray.add(string1);

      }
      // 전역변수 studentNumArray 배열에 순서대로
      // 전역변수 num01의 값을 추가(add)
      // 추가 : 배열의 끝에 추가적으로 저장
      studentNumArray.add(num01);
      studentNumArray.add(num02);
      studentNumArray.add(num03);
      studentNumArray.add(num04);
      studentNumArray.add(num05);
   }
   
   private static void positionArraySet(int beforPosition, int afterPosition, String name) {
      positionArray.set(beforPosition, positionArray.get(afterPosition));
      positionArray.set(afterPosition, name);
   }

   private static int random_count0_24() {
      // Math.random() : 0.0.. ~ 0.99.. 사이 수를 랜덤으로 출력
      // 0.00..*25 = 0;
      // 0.99..*25 = 24.99..; 1*25 = 25 -> 1보다 작은 수를 곱하므로
      // 결론적으로 24.99..값이 출력됨!
      // (int) 형변환하므로 소수점 삭제
      // 0~24 숫자(정수) 중에 한 개 출력
      return (int) (Math.random() * 5);
   }

   private static void view_position(ArrayList<String> positionArray) {
      System.out.println("[문]--------------------------");
      for (int i = 1; i <= positionArray.size(); i++) {
         if (i % 2 == 0) {
            System.out.printf(positionArray.get(i - 1) + "/ ");
            System.out.println();
         } else {
            System.out.printf(positionArray.get(i - 1) + "/ ");
         }
      }
      System.out.println();
   }

}