package com.human.ex20221004;

public class StudentInfo {
	String name = "";
	String company = "휴먼교육센터";
	String studytime = "교육시간 : am 09:00 ~ pm 05:30";
	
	public String studentinfo() {
		String info = "학생들의 정보를 출력합니다";
		info += "\n " + name + "\n " + company + "\n " + studytime;
		return info;
	}
}
