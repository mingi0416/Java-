package com.human.ex20221018;

public class Student {
	private String department;
	private int studentnum;
	
	Student(String department, int studentnum){
		this.department = department;
		this.studentnum = studentnum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("컴공과", 14);
		Student st2 = new Student("컴공과", 15);
		Student st3 = new Student("국문과", 20);
		Student st4 = new Student("화학과", 18);
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
		System.out.println(st4.toString());
	}

	
	public String toString() {
		return String.format("%s 학과 %s 학번", department, studentnum);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}
	
}

