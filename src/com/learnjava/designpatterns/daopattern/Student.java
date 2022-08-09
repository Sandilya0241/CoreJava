package com.learnjava.designpatterns.daopattern;

public class Student {
	private String strStudentName; 
	private int nRollNum;
	public Student(String strStudentName, int nRollNum) {
		this.setnRollNum(nRollNum);
		this.setStrStudentName(strStudentName);
	}
	public String getStrStudentName() {
		return strStudentName;
	}
	public void setStrStudentName(String strStudentName) {
		this.strStudentName = strStudentName;
	}
	public int getnRollNum() {
		return nRollNum;
	}
	public void setnRollNum(int nRollNum) {
		this.nRollNum = nRollNum;
	}
}

/*
 * 
 * Create table student1 (
 * name varchar2(255),
 * rollNum number
 * )
 */