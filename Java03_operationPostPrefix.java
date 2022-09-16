package com.human.code20220916;

public class Java03_operationPostPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2022 09 16 history
		//1. 단항연산자(피 연산자(변수)가 하나인 것)
		//   삼항 연산자(?true:false)
		//2. 전위 연산자, 후위 연산자
//			 전위연산자 : ex) ++i; 계산 완료 후 출력한다
//			 후위연산자 : ex) i++; 계산 전에 출력하고 연산한다.
		//3. 오버플로우 (스택오버플로우)
//		타입이 갖고 있는 max값보다 더 많은 수치를 받을 경우
//		ex) int의 max값은 약 2억정도 인데, 그 이상의 수치를 대입하면
//		max값인 2억정도만 출력된다 (저장된다)
		
//		postPreFixExample();
//		int int1 = 10;
//		int int2 = 4;
//		double int3 = 10;
//		double int4 = 4;
		
//		//10나누기 4 = 2.5
//		//int는 정수표현 : 소수점 이후는 표현이 불가 = 2만 출력
//		int result2 = int1 / int2;
//		//int는 정수표현 : 소수점 이후는 표현이 불가 = 2만 출력되고
//		//result3에 2라는 정수를 double로 형변환하여 변수에 할당
//		double result3 = (double) int1 / int2;
//		double result4 = int3 / int4;
//		double result5 = int1 / int4;
//		
//		System.out.println(result2); //2
//		System.out.println(result3); //2
//		System.out.println(result4);
//		System.out.println(result5);

		//overflow
		//타입이 갖고 있는 max값보다 더 많은 수치를 받을 경우를 일컫음
		int x = 10000000;
		int y = 10000000;
		double z = (double) x * y;
//		long z =(long) x * y;
		System.out.println(z);
		
//		int i = 0;
//		//부호연산자는 변수 앞에 부호를 붙히는 것
//		//부호를 붙힌다는 것은 부호1 곱셈과 같다 (ex)
//		int result = i;
//		System.out.println(result);
		
//		int i = 0;
		//후위연산자 (연산자(+)가 뒤에 있는 것을 말함)
		//전위연산자 (연산자(+)가 앞에 있는 것을 말함)
//		i++;
//		i = i+1;
//		System.out.println(i);
		
//		int x = 10;
//		int y = 10;
//		int z;
//		
//		System.out.println("--------------");
//		x++;
//		++x;
//		System.out.println("x=" + x); //x = 12
//		
//		System.out.println("--------------");
//		y--;
//		--y;
//		System.out.println("y=" + y); //y = 8
//		
//		//후위연산자 : x의 기존값을 그대로 할당(대입)한 뒤에 연산
//		System.out.println("--------------");
//		z = x++;
//		System.out.println("z=" + z); //z = 12
//		System.out.println("x=" + x); //x = 13
//
//		
//		System.out.println("--------------");
		
		//전위연산자 : x값을 연산 후 z에 할당(대입)한다
		//1. ++x; (x=x+1)
		//2. z = x;
		//대입연산자(=) 기준으로 우측 항이 실행되고, 우측 항의 좌측부터 연산이 시작
		z = ++x; 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
//		z = 14
//		x = 14
//		y = 8
//		++x = 14의 값을 1 증가 한 후 z에 값에 할당
//		y++ = 8의 값을 z에 연산 후 y의 값 1 증가
//		y는 9가 되어서 출력
		System.out.println("--------------");
		z = ++x + y++;
		System.out.println("z=" + z); //z = 23
		System.out.println("x=" + x); //x = 15
		System.out.println("y=" + y); //y = 9
		
		System.out.println("--------------");
		
		int a = 12;
		int b = 4;
		int c;
		c = ++a + b--;
		System.out.println("a = " + a); // 13
		System.out.println("b = " + b); // 3
		System.out.println("c = " + c); // 17
		


	}

}
