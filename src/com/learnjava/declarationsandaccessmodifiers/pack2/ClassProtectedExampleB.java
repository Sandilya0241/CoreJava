package com.learnjava.declarationsandaccessmodifiers.pack2;

import com.learnjava.declarationsandaccessmodifiers.pack1.ClassProtectedExampleA;

public class ClassProtectedExampleB extends ClassProtectedExampleA{
	
	public static void main(String[] args) {
		ClassProtectedExampleA a = new ClassProtectedExampleA();
//		a.m1();  //The method m1() from the type ClassProtectedExampleA is not visible
		
		ClassProtectedExampleB b = new ClassProtectedExampleB();
		b.m1();
		
		ClassProtectedExampleA c = new ClassProtectedExampleB();
		//c.m1();
		
	}
}
