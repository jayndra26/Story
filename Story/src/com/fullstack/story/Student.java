package com.fullstack.story;

public class Student {
	private String studentName;
	private int studentRollNo;
	public Student(String rupaObj, int studentRollNo) {
		super();
		this.studentName = rupaObj;
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	
	
	

}
