package com.learnjava.declarationsandaccessmodifiers;

public class DclrNAcssMod007 extends DclrNAcssMod006{

	public int getNoOfWheels() {
		return 7;
	}
	public static void main(String[] args) {
		DclrNAcssMod007 o = new DclrNAcssMod007();
		System.out.println(o.getNoOfWheels());
//		DclrNAcssMod006 obj = new DclrNAcssMod006(); //Cannot instantiate the type DclrNAcssMod006
	}
//	abstract final void getMyName();//The abstract method getMyName in type DclrNAcssMod007 can only be defined by an abstract class
}
