package com.human.code20220915;

public class Java02_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 1048;
		for(int i=0; i<30; i++) {
			System.out.println("현재 for문 실행 순서 = " + i + "번째");
			sum = sum/2;
			//1. for문이 0번째 실행되고 종료된다
			//2. for문 안에 if문 넣고 break를 실행하면 for문까지 종료된다!
			// > for문에 특정 값이 되면 강제적으로 for문을 종료할 수 있다
			if(sum<2) {
				System.out.println(+ i + "번째에서 종료합니다. 현재 sum은" + sum + "입니다");
				break;	
			}
			
		}
	}

}
