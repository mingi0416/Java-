package com.human.ex20221014;

public class ShapeMain {
	public static void main(String[] args) { 
		// 객체   생성   및    초기화    - 정사각형 
		Square s = new Square();
		s.name = "정사각형";
		s.length = 5;

		// 객체   생성   및    초기화    - 삼각형 
		Triangle t = new Triangle();
		t.name = "삼각형";
		t.base = 4; 
		t.height = 3;

		// 객체   생성   및    초기화    - 원 
		Circle c = new Circle();
		c.name = "원";
		c.radius = 4;
		// 업   캐스팅    - 도형    배열에    정사각형, 삼각형, 원    담기 

		Shape[] shapes = { s, t, c };
		// 모든   도형의    넓이    계산    및    출력 
		//		for (int i = 0; i < shapes.length; i++) {
		//			Shape tmp = shapes[i];
		//			System.out.printf("%s의    넓이    -> %.2f\n", tmp.name, tmp.area()); 
		//		}

		for (int i = 0; i < shapes.length; i++) {
			Shape tmp = shapes[i];
			//			tmp.printArea(); //shape 는 못부름
			//          shapes[0];
			System.out.printf("%s의    넓이    -> %.2f\n", tmp.name, tmp.area()); 
			
			
			tmp.printArea();

//			if( !(tmp instanceof Circle) ) {
//				tmp.printArea();
//			}
			
//			if(tmp instanceof Square) {
//				Square sq = (Square)tmp;
//				sq.printLength(); //Square는 부름
//			}
//			
//			if(tmp instanceof Triangle) {
//				Triangle tr = (Triangle)tmp;
//				tr.printBase();
//			}
//
//			if(tmp instanceof Circle) {
//				Circle ci = (Circle)tmp;
//				ci.printRadius();
//			}

			//instanceof 를 활용해서 printArea();
		}


	}
}
//도형
class Shape {
	String name;
	//도형의 넓이를 반환 
	public double area() { 
		return 0;
	}
	
	public void printArea() {
		
	}
}

//정사각형
class Square extends Shape { 
	int length; // 한    변의   길이
	/* 1. 정사각형    넓이를   구하도록    area()를    재정의하세요. */
	public double area() {
		//정사각형의 넓이를 반환

		//이함수의 return은 double 일겁니다
		//return int*int int
		double result = length * length;
		return result;
	}
	public void printArea() {
		//뭔가 일을하는 printArea();		
	}
	public void printLength() {
		System.out.printf("%s의    넓이    -> %.2f\n", name, area());
	}
}
//삼각형
class Triangle extends Shape { 
	int base; // 밑변
	int height; // 높이
	/* 2. 삼각형    넓이를    구하도록    area()를    재정의하세요. */
	public double area() {
		//3 * 5 / 2 = 7.5 
		double result = (double)base*height/2.0; //삼각형의 넓이
		return result;
	}
	public void printArea() {
		//뭔가 일을하는 printArea();
	}

	public void printBase() {
		System.out.printf("%s의    넓이    -> %.2f\n", name, area());
	}
}

//원
class Circle extends Shape { 
	int radius; // 반지름

	public void printArea() {
		//아무일도 하지마 안해
	}
	public double area() {
		double result = radius*radius* Math.PI; //3.141592653589793
		return result;
	}

	public void printRadius() {
		System.out.printf("%s의    넓이    -> %.2f\n", name, area());
	}
}
/* 3. 원의    넓이를    구하도록    area()를    재정의하세요. */






