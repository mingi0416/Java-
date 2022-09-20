package com.human.code20220920;

import java.io.IOException;

public class Java04_0002_forwhile {

	//20220920 history
	//for와 while과 System.in.read()과 math.random()
	//while(boolean) : boolean타입으로 true값일 경우 무한 반복
	//while문이 할 수 있는것은 for문이 다 할 수 있음!
	//int num = (int) (Math.random() * n)+startNumber;
	//equals() : 문자열 비교 (숫자 비교 == 와 유사)
	
	//2.반복문과 break와 continue
	//continue : 하단 코드 생략하고 처음으로 돌아가기
	//3.if와 switch
	//do while : 먼저 실행되는 코드가 있고 나중에 반복문

	//5. key값 입력받음 + 메소드 실행 타임

	
	public static void main(String[] args) throws Exception {
//		studyForWhile();
//		keyPressExample();
		keyPressExample2();
	}

//	public static void studyForWhile() {
//		//for문 : 반복문 : 특정값 기준으로 조건이 성립할 때 까지 코드 반보
//		//메모리에 sum이라는 변수를 선언하고 (타입은 int)
//		//0이라는 숫자를 =(대입연산자)를 통해 sum에 할당(저장)
//		int sum = 0;
//		//초기식 : int i = 1; i변수 기준으로 1부터 시작한다
//		//조건식 : i<=100; i는 100 이하일 때까지 for문을 실행한다
//		//증감식 : for문 한번 돌 때마다 i는 1씩 증가한다
//		for(int i=1; i<=100; i++) {
//			//sun + i; sum이라는 변수를 가져다가 i를 더하여
//			//=(대입연산자)를 통해 sum이라는 변수에 할당(저장)
//			//sum = sum + i
//			// 1 = 0 + 1
//			// 3 = 1 + 2;
//			// 6 = 3 + 3;
//			// 10 = 6 + 4;
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		//sum 변수의 값을 0으로 저장
//		sum = 0;
//		//for문 계속 돌기(조건식 없으므로 무한 돌기)
//		for(int i = 1 ;; i++) {
//			sum = sum + 
//					
//					i;
//			//if조건이 성립되면 {}코드 안에 break; 코드가 실행되어
//			//가장 가까운 for문을 종료 시킴
//			if(i==100) {
//				break;
//			}
//			
//		}
//		System.out.println(sum);
//		
//		//boolean 타입은 true/false값만 넣을 수 있음
//		//boolean 타입 flag 변수 이름으로 메모리에 영역 선언
//		//=(대입연산자)를 통해 true 값을 flag 변수에 할당(저장)
//		boolean flag = true;
//		//0이라는 숫자를 sum변수를 가져다가 저장
//		sum = 0;
//		int i = 0;
//		//while() : 조건이 true일 때까지 무한 반복
//		while(true) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			//짝구일 경우만 출력하고,
//			//100보다 작을 때까지 while문을 돌리시오
//			//i++; 후위연산자로 i값을 먼저 출력하고, i를 1 증가
//			i++;
//			//if(i==100) i의 값을 메모리에서 가져와서
//			//100이라는 숫자와 동일하면 {}코드 영역을 실행
//			//{}코드영역의 break;를 실행하여
//			//가장 가까운 for문을 종료
//			if(i>100) {
//				break;
//			}
//		}
//	}
	
	public static void keyPressExample2() throws IOException {
		
		//디버깅모드 : 코드를 한줄씩 인식하여 알고리즘 어떻게 흘러가는지 보는 모드
		//장점1. 변수 모두 다 확인 가능 (현재 코드 줄수에서 변수 데이터 확인)
		//장점2. 코드 한 줄씩 보기 때문에 사람이 식별할 수 있는 속도
		
		//에어컨 리모콘 만들기
		//현재 온도는 30도이다
		//냉방모드에서 1번을 누르면 온도 1감소, 2를 누르면 온도 1증가를
		//진행하는 리모콘이 있다.
		//3을 누르면 터보모드로 최저온도인 18도로 세팅이 된다.
		long startNanotime = 0; //키를 눌렀을 때부터 새로운 메뉴가 나올때까지의 시간
		long endNanotime = 0; //
		
		boolean ac = true;
		int tm = 30; //현재 온도
		int keycode = 0; //키보드의 값을 저장하는 변수 >> 메모리에 저장
		
		//while(true) ()조건식이 true이면 계속 반복
		while(ac) {
			//in.read()메서드에서 받은 코드가 13, 10 모두 아닐 경우
			//&&로 모두 참이면 if{}코드 영역 실행
			//keycode != 13 : keycode 변수의 값이 13이 아니면! 맞다!(참)
			//keycode != 10 : 변수의 값이 10이 아니면! 맞다(참)
			//&& 두 조건이 모두 참이면 결과는 참이다
			//두 조건 중에 하나라도 거짓이면(false) 결과는 거짓이다
			if(keycode!=13 && keycode!=10) {
				System.out.println("--------------------------------------");
				System.out.println("1.온도감소 | 2.온도상승 | 3.터보모드 | 4.종료");
				System.out.println("--------------------------------------");
				System.out.println("선택: ");
		}
		//System.in.read();
		//System이라는 JVM내장 객체를 가져와서
		//im.read()메서드를 실행하면
		//컴퓨터에 연결된 키보드가 입력하는 값을 받아서 자바code에 전달
		//전달된 값은 keycode 변수에 저장
		keycode = System.in.read();
		
		if(keycode == 49 && tm>18) {
			tm--;
			System.out.println("온도를 1도 낮춥니다. 현재 온도는 " + tm + " 도 입니다.");
		}else if(keycode == 49 && tm<=18) {
			tm = 18;
			System.out.println("온도를 더 이상 내릴 수 없습니다. 현재 온도는 "+ tm + " 도 입니다.");
		}else if(keycode ==50) {
			tm++;
			System.out.println("온도를 1도 올립니다. 현재 온도는 " + tm + " 도 입니다.");
		}else if(keycode == 51) {
			tm=18;
			System.out.println("터보모드로 변경합니다. 현재 온도는 " + tm + " 도 입니다.");
		}else if(keycode == 52) {
			System.out.println("에어컨을 종료합니다");
			ac = false;
		}
		}
	}
	

		//throws Exception 코드 중에 키보드 또는 마우스 입려값을
		//받아서 실행하는 코드 일 경우 JVM밖에서 일어나는 에러를 처리하기 위한
		//선언
	public static void keyPressExample() throws Exception {
		//System.in.read(); 키보드의 입력값을 정수로 변환하여 전달
		//전달된 값은 =(대입연산자)를 통해 keycode변수에 할당(저장)
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			//keycode가 13이 아니고 (!=) >>true : 13이 아니면 트루
			//keycode가 10이 아니면 (!=) >>true : 10이 아니면 트루
			//두 개 다 true일 때만 {}코드 영역 실행
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("---------------------");
				System.out.println("선택: ");
			}
			//System.in.read(); 메소드를 사용하여 사용자가 입력한 키보드 값 받기
			//단, enter키를 눌렀으므로 13 10 이라는 코드를 같이 받음
			//while문을 입력받은 값 1번, 13코드 1번, 10 코드 1번 총 3번의
			//while문을 실행한다 (System.in.read(); 에서 전달받은 코드가
			//모두 다 전달되어 비워질 때 까지!)
			keyCode = System.in.read();
			
			//keycode의 값이 49일 경우 {}코드 영역 실행
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도= " + speed);
			}else if(keyCode ==50) {
				speed--;
				System.out.println("현재 속도= " + speed);
			}
			else if(keyCode == 51) {
				//메모리에 있는 run이라는 변수를 가져와서
				//flase값을 =(대입연산자)로 할당(저장)
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
//		while(true) {
//			int keycode = System.in.read();
//			System.out.println(keycode);
//			//keycode로 입력받은 값이 0일 경우
//			//정수 48을 인식한다, 단, enter키를 눌렀기 때문에
//			//13하고 10도 같이 인식한다
//			//즉, 0과 enter를 누르면 48 13 10이라는 숫자를 인식한다
//				if(keycode==48) {
//					System.out.println("0");
//				}else if(keycode==49){
//					System.out.println("1");
//				}else if(keycode==50){
//					System.out.println("2");
//				}else if(keycode==51){
//					System.out.println("3");
//				}
//			}
		}
}