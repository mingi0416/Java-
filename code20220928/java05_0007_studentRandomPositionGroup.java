package com.human.code20220928;

import java.util.ArrayList;
import java.util.Scanner;

public class java05_0007_studentRandomPositionGroup {

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
static Scanner sc = new Scanner(System.in);
   static ArrayList<String> studentNumArray = new ArrayList<>();
   static ArrayList<String> positionArray = new ArrayList<>();

   static String num01 = "권지혜";
   static String num02 = "김건희";
   static String num03 = "김민기";
   static String num04 = "김민기";
//   static String num04 = "김정환";
   static String num05 = "김지희";
//   static String num06 = "김현중";
//   static String num07 = "박경환";
//   static String num08 = "박송헌";
//   static String num09 = "박유진";
//   static String num10 = "박주성";
//   static String myname = "김민기";

   // 위에까지 내용(변수들..)은 필드로써 여러가지 메서드들이 접근하여
   // 저장 혹은 수정을 할 수 있음

//   private static void test() {
//      System.out.println(num02);
//   }
//
//   private static void fix() {
//      num02 = "박준석";
//   }

   public static void main(String[] args) {
//      String num01 = "김준석";
      // num01 은 전역변수(필드), 지역변수(메서드 안에 선언된 변수)
      // 모두 같은 이름인데, 호출 할 때는 지역변수로 호출 됨

      // 호출되는 시점에서 가장 가까운 변수를 가져옴
//      System.out.println(num01);
      
      // 메서드 안에서 필드 값을 바꿀 수 있음
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)
//      fix(); // fix()메서드를 가져와서 실행 (num02 전역변수 값을 박준석으로 바꿈)
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)
	  
	   //1)만약 positionArray 배열의 길이를 10으로 늘리고 싶다면
	   //init(0메서드를 어떻게 수정하시겠습니까?
	   //ex) 인자값, 매개변수 활용해서 만들어보세요~
	   //2)init()메서드를 사용하여
	   //positionArray 배열의 길이는 12이고,
	   //안에 값은 (칸마다) 김준석1, 김준석2, 김준석3,... 김준석 12까지
	   //들어가도록 수정해보세요
	   //ex) 인자값, 매개변수 사용하시고, (문자열+숫자) 사용하세요
	   //1. 변수는 1개 데이터만 담을 수 있다
	   //2. 매개변수는 각 데이터를 담아서 메서드에서 사용할 수 있다
	   //3) init()메서드를 사용하여
	   //positionArray 배열의 길이는 25칸이고, 안에 값은 "-" 넣는다
	   //단, positionArray의 13번째 칸에 본인의 이름을 넣어서 출력하시오
	   //ex) if문을 써서 특정 i의 값이 되면 본인의 이름을 넣도록 코드를 작성!
	   //4) init()메서드를 사용하여
	   //positionArray 배열의 길이는 25칸이고, 안에 값은 "-" 넣는다
	   //단, 배열의 짝수 일 때에는 "~"표시로 저장하시오
      init(5, "-");
      //positionArray.size() : arrayList배열의 칸 길이를 알려줌
      //intList.length : 고정배열의 칸 길이를 알려줌
//      System.out.println(positionArray.size());
      for(int i = 0; i<positionArray.size(); i++) {
    	  //positionArray.get(i) : positionArray 배열의
    	  //i번째 칸의 값을 가져오겠다! (get!)
    	  System.out.println(positionArray.get(i));
      }
      
      String tempName = "";
      int randomNumber = 0;
      String myname = "";
      int wp = 0;
      int lp = positionArray.size()-1;
      //for문 : 반복문 : 특정 조건이 성립할 때까지 코드{}를 반복하겠다!
      //조건절 : i < positionArray.size(); : i의 값이
      //positionArray.size(); 크키보다 작을 때까지!
      for (int i = 0; i < positionArray.size(); i++) {
    	  //if(조건식) : 조건식이 true일 때 코드{} 실행
    	  //positionArray.get(i).equals("-")
    	  //positionArray 배열의 i번째 칸의 값이 "-"와 같으면(equals)
    	  //A.equals("-") : 문자열"-"과 A의 값을 비교하겠다!
    	  //positinArray.get(i) : 배열의 i번째 값을 가져오겠다(get)
    	  //equals() 메서드를 쓰면 비교에 따라서 같으면 true,
    	  //다르면 false가 반환됨(result:결과값)
         if (positionArray.get(i).equals("-")) {
            for (;;) {
            	//random_count0_24(); 메서드를 실행하여 결과값을
            	//randomNumber 변수에 할당(저장)
               randomNumber = random_count0_24();
               //studentNumArray 배열에 ?번째 값을 출력
               //? = randomNumber으로 랜덤으로 값을 출력한 정수
               //tempNmae 변수에 학생이름을 저장
               tempName = studentNumArray.get(randomNumber);
               //temName.equals("-") :
               //temName 변수 값이 "-"이면 true
               //그 true의 값을 !(반전)을 하면 false
               //그러므로 if문 조건이 성립되지 않는다!
               if (!tempName.equals("-")) {
            	   //위에 조건이 성립되면
            	   //tempName 변수값은 학생 이름이고
            	   //tempName을 positionArray 배열의 i번째 칸에 저장
            	   //A.set(i, tempName)
            	   //A배열의 i번째 칸에 tempName변수 값을 저장
                  positionArray.set(i, tempName);
                  studentNumArray.set(randomNumber, "-");
                  break;
                           
               }
            }
            
         }
      }
      view_position(positionArray);
      searchName(tempName);
//      view_position(positionArray);
      
//      System.out.println("이름을 입력하세요");
//      myname = sc.nextLine();
      int find = 0;
//      String changeName = positionArray.get(0);
      for(int i=0; i<positionArray.size(); i++) {
    	  if(positionArray.get(i).equals(myname)) {
    		  find = i;
    	  }
      }
      
   // 2-1. 본인의 이름을 임의로 바꿀 수 있는 기능(메서드)을 구현하시오
      // 1) 본인의 이름을 검색할 수 있는 if문과 scanner를 사용하여
      // 변수에 저장 할 수 있는 기능을 추가하시오
      // 2) 동명이인 일경우는 어떻게 처리할지 생각하시오
      // hint1. ArrayList<ArrayList<String> 타입 또는
      // ArrayList<String[] 타입에 대해 구글링하시오
      
//      ArrayList<ArrayList<String>> test = new ArrayList<>();
//      
//      ArrayList<String> arr1 = new ArrayList<>();
//      ArrayList<String> arr2 = new ArrayList<>();
//      ArrayList<String> arr3 = new ArrayList<>();
//      
//      arr1.add("김준석1");
//      arr1.add("김준석2");
//      arr2.add("박준석1");
//      arr2.add("박준석2");
//      
//      test.add(arr1);
//      test.add(arr2);
//      test.add(arr3);
//      
//      System.out.println(test.get(0).get(0));
//      System.out.println(test.get(1).get(1));
//      
//      for(int i =0; i<test.size(); i++) {
//         System.out.println(i+" : "+test.get(i));
//      }
//      
//      //예제) 김준석1의 id는 abcd1 이고 pw 12341234이다
//      //김준석2의 id는 abcd2 이고 pw 123qq이다
//      //김준석3의 id는 abcd55 이고 pw 123aa이다
//      //이것을 저장하는 배열을 만들어 보시오
//      
//      ArrayList<ArrayList<String>> saveAccount = new ArrayList<>();
//      
//      ArrayList<String> account1 = new ArrayList<>();
//      account1.add("김준석1");
//      account1.add("abcd1");
//      account1.add("12341234");
//      
//      ArrayList<String> account2 = new ArrayList<>();
//      account2.add("김준석2");
//      account2.add("abcd2");
//      account2.add("123qq");
//      
//      ArrayList<String> account3 = new ArrayList<>();
//      account3.add("김준석3");
//      account3.add("abcd55");
//      account3.add("123aa");
//      
//      saveAccount.add(account1);
//      saveAccount.add(account2);
//      saveAccount.add(account3);
//      //id가 abcd55인 사람의 이름을 출력하시오
//      
//      for(int i = 0; i<saveAccount.size(); i++) {
//         if(saveAccount.get(i).get(1).equals("abcd55")) {
//        	 System.out.println("abcd55는 " + i + "번째 배열에 있습니다.");	 
//         }
//         
//      }
      
      
      // hint2. 데이터 입력시간은 동일 할 수 없는 이유에 대해 생각해보세요
      // 컴퓨터는 순차적으로 일을 처리하므로, 코드 한 줄씩 실행할 때마다
      // 그 순서는 명확해진다 -> 다른 줄의 코드는 각각 다른 시간에 실행된다
      // -> 변수는 동일한 시간에 선언되고 저장될 수 없다
      
      //4번 문제 풀이
//      if(find==0) {
//    	  System.out.println(myname + "씨는 첫번째 자리입니다. 마지막 자리로 바꿉니다.");
//    	  positionArray.set(find, positionArray.get(lp));
//    	  positionArray.set(lp, myname);
//    	  view_position(positionArray);
//      }else {
//    	  System.out.println(myname + "씨는 첫번째 자리가 아닙니다.");
//      }
      
      //3번 문제 풀이
//      if(find==4) {
//      	System.out.println(myname + "씨는 혼자시네요 자리를 바꿀게요");
//      	System.out.println("원하는 자리를 입력하세요");
//        wp = sc.nextInt();
//      	positionArray.set(find, positionArray.get(wp));
//      	positionArray.set(wp, myname);
//      	view_position(positionArray);
//      }else {
//    	System.out.println(myname + "씨는 짝궁이 있습니다.");	
//      }
      
      		//2번 문제 풀이
//      	if(find%2==0) {
//        	System.out.println(myname + "씨는 왼쪽자리입니다");  
//        }else {
//      	System.out.println(myname + "씨는 오른쪽 자리입니다. 자리를 바꿉니다");
//      	//1. 바꿀사람의 이름은 0번째에 고정되어 있으므로
//      	//먼저 본인 위치에 바꿀 사람의 이름으로 교체하여 저장
//      	positionArray.set(find, positionArray.get(find-1));
//      	//0번째 배열에 본인 이름 넣기
//      	positionArray.set(find-1, myname);
//      	
//      	
//      	view_position(positionArray);
//        }
      
      	//1번 문제 풀이
//      if(positionArray.get(0).equals(myname)) {
//      	System.out.println(myname + "씨는 0번째 위치입니다");  
//      }else {
//    	System.out.println(myname + "씨는 0번째 위치가 아닙니다");
//    	//1. 바꿀사람의 이름은 0번째에 고정되어 있으므로
//    	//먼저 본인 위치에 바꿀 사람의 이름으로 교체하여 저장
//    	positionArray.set(find, positionArray.get(0));
//    	//0번째 배열에 본인 이름 넣기
//    	positionArray.set(0, myname);
//    	
//    	
//    	view_position(positionArray);
//      }
     
      // 1-1. 본인의 자리가 맨 앞자리가 아니면 맨 앞자리로 바꾸는 기능을 구현하시오
      //1)본인의 이름을 equals로 검색하고,
      //positionArray 배열의 위치가 0번째가 아니면,
      //0번째로 바꾸시오
      //2)그리고, 0번째에 있던 친구의 이름을 전에 있던 본인의 위치로 이동하시오
      
      // 1-2. 본인의 자리가 우측이면 좌측으로 바꾸는 기능을 구현하시오
      //1) 본인의 이름을 찾는다 -> 배열의 i값(칸의 위치) 찾을 수 있음
      //if(positionArray.get(i).equals("김민기"))
      //2) 배열은 0부터 시작하므로 짝수이면 좌측, 홀수이면 우측이므로
      //홀수 칸 위치이면 짝수 칸으로 바꾸는 코드 작성하시오
      //3) 홀수는 선택의 여지가 3개입니다
      //단, 자기 줄수 위치에서 좌측으로 바꾸시오
      //예)본인 위치가 배열의 4번째(i=3)이면
      //2번째 줄이므로 (0,1(첫번째 줄), (2,3(두번째 줄)
      //i를 3에서 2로 바꿉니다. (두번 째 줄 우측에서 좌측 자리로 바꿈)

      // 1-3. 본인의 자리가 홀로 자리이면 짝궁이 있는 자리로 바꾸는 기능을 구현하시오

      // 1-4. 본인의 자리가 첫 번째이면 마지막으로 바꿀 수 있는 기능을 구현하시오

      // 2-1. 본인의 이름을 임의로 바꿀 수 있는 기능을 구현하시오

      // 2-2. 임의의 학생을 추가하여 자리를 재배치 할 수 있는 기능을 구현하시오

      // 3-1. 자리 재배치를 했을 때 본인의 자리가 몇 번이었는지
      // 기록을 남기고 출력하시오

      // 3-2. 자기는 혼자 자리를 앉는지 확인하는 메서드를 만들고,
      // 만일 혼자 자리가 아니면, 자리를 재배치 하도록 코드를 구현하시오

   }

   //private : 접근제한자로써 int()메서드는 같은 class내에서만 쓸 수 있음
   //예) 여기 클래스에서 여러 메서드들이 있는데, 클래스 내부에서만 쓸 수 있고,
   //외부 클래스(다른 자바파일 등등..)에서는 init()메서드를 호출하여 쓸 수 없음
   //<> public
   //static : 한 개만 있음! <> 인스턴스
   //void : 메서드를 실행하면 return 값이 없음
   //예) String abc = init(); (x) init()메서드는 void이므로
   //abc변수에 무언가의 값을 저장 할 수 없음
   //(int number) : 매개변수
   //데이터를 전달하여 받는 매개체+변수 (매개변수)
   //(int number = 10);
   //int number 타입과 변수이름으로 선언 = 10;
   
//   private static void account(String a, String b, String c) {
//   	   saveAccount.get().get()
//   }
   
   private static void init(int number, String name) {
	  //초기식 : int i = 0;
	  //조건식 : i < 5; (for문 돌때마다 i의 값을 확인하는데
	  //5보다 작을 때까지 for은 계속 돈다!)
	  //증감식 : i++ : for문 한 번 돌때마다 i의 값은 1씩 증가
      for (int i = 0; i < number; i++) {
    	 //전역변수 positionArray 배열에 순서 대로
    	 //0~4번째 배열칸에 "-" 추가(add)
    	 //매개변수 name의 값을 add()로 저장
    	 //name+(i+1) : i는 숫자, 1도 숫자, name은 문자열
    	 //문자열이 우선순위 형변환이므로
    	 //좌측 name변수 타입으로 모두 변환되어 출력
    	 //ex) 김준석51
    	 //()괄호를 써서 숫자 연산부터 한 뒤에 name(문자열)으로 같이 형변환
    	 positionArray.add(name);
//    	 if(i==12) {
//     		 positionArray.add(myname);
//         }else{
//    	 if(i%2==0) {
//    		 positionArray.add(name+(i+1));
//    	 }if(i%2==1) {
//    		 positionArray.add(name1+(i+1));
//    	 }
//      }	
   }
      //전역변수 studentNumArray 배열에 순서대로
      //전역변수 num01의 값을 추가(add)
      //추가 : 배열의 끝에 추가적으로 저장
      studentNumArray.add(num01);
      studentNumArray.add(num02);
      studentNumArray.add(num03);
      studentNumArray.add(num04);
      studentNumArray.add(num05);
//      studentNumArray.add(num06);
//      studentNumArray.add(num07);
//      studentNumArray.add(num08);
//      studentNumArray.add(num09);
//      studentNumArray.add(num10);
//      studentNumArray.add(num11);
//      studentNumArray.add(num12);

   }

   private static int random_count0_24() {
	   //Math.random() : 0.0.. ~ 0.99.. 사이 수를 랜덤으로 출력
	   //0.00..*25 = 0;
	   //0.99..*25 = 24.99..; 1*25 = 25 -> 1보다 작은 수를 곱하므로
	   //결론적으로 24.99..값이 출력됨!
	   //(int) 형변환하므로 소수점 삭제
	   //0~24 숫자(정수) 중에 한 개 출력
      return (int) (Math.random() * 5);
   }

   private static void searchName(String name) {
	   //1개이면 1명, 2개이상이면 동명이인
	   System.out.println("이름을 입력하세요");
	   String name1 = sc.nextLine();
	   int count = 0;
	   for(int i=0; i<positionArray.size(); i++) {
		   if(positionArray.get(i).equals(name1)) {
			   count++;
		   }
	   }
	   if(count==1) {
		   System.out.println("동명이인이 없습니다");
	   }
	   else if(count>1) {
		   //동명이인
		   //아래 메서드는 모든 이름을 바꾸게 됩니다!
		   //특정 동명이인만 바꿀 수 있도록 기준과 코드를 구현하시오
		   //기준 : 이름을 입력한 순서(날짜, 시간)으로 정렬하여 구분
		   System.out.println("동명이인이 있습니다");
		   changeName(name1);
	   }
   }
   
   private static void changeName(String name) {
	   System.out.println("바꾸고 싶은 이름을 입력하시오");
	   String temp = sc.nextLine();
	   for(int i = 0; i<positionArray.size(); i++) {
		   if(positionArray.get(i).equals(name)) {
			   positionArray.set(i, temp);
			   break; 
		   } 
	   }
	   view_position(positionArray);
}

//private static void samename(ArrayList<ArrayList<String>> saveAccount) {
//	  for(int i = 0; i<saveAccount.size(); i++) {
//		  if(saveAccount.get(i).get(1)==saveAccount.get(i+1).get(1)) {
//			  System.out.println("이름이 같습니다.");
//		  }
//	  }
//   }
   
   private static void view_position(ArrayList<String> positionArray) {
      System.out.println("[문]--------------------------");
      for (int i = 1; i <= positionArray.size(); i++) {
         if (i % 2 == 0) {
            System.out.printf(positionArray.get(i - 1) + "/ ");
            System.out.println();
            
         }
//         else if (i==13) {
//        	 System.out.printf(myname + "/ ");
//         }
         else{
            System.out.printf(positionArray.get(i - 1) + "/ ");
            
         }
      }
      System.out.println();
   }

}