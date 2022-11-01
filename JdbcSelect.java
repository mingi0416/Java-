package com.human.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//1. 드라이버 로딩
			//class.forName == new 클래스() 문자열로 클래스 생성하는 메소드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 연결");
			
			//2. 데이터베이스 연결 정보 세팅 Connection클래스
			//jdbc:oracle:thin:(제품명)@localhost(주소):1521(포트):xe(씨드아이디)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##human";
			String pw="human";
			Connection conn = DriverManager.getConnection(url,user,pw); 
			System.out.println("데이터베이스에 접속 성공");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
