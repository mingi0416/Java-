package com.human.ex20221011;

import java.awt.Rectangle;

public class ShapeMain {
public static void main(String[] args) {
// TODO Auto-generated method stub
Circle circle = new Circle();
circle.setRadius(9);
System.out.println("넓이 : " + circle.getArea() );
//원의 넓이 : 반지름 * 반지름 * 3.14 (PI)
Rectangle rec = new Rectangle(5, 10); //width, hegiht
//System.out.println("넓이 : " +  rec.getArea() );
System.out.println("넓이 : " + rec.height * rec.width );
////밑변 * 높이
Triangle tri = new Triangle();
tri.setsize(6, 8); //width 와 height 를 저장
System.out.println("넓이 : " + tri.getArea1() );
////밑변 * 높이 / 2
}
}