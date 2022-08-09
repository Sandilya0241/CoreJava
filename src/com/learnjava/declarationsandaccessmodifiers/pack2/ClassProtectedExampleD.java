package com.learnjava.declarationsandaccessmodifiers.pack2;

import com.learnjava.declarationsandaccessmodifiers.pack1.ClassProtectedExampleA;

class ClassProtectedExampleC extends ClassProtectedExampleA {
	
}

public class ClassProtectedExampleD extends ClassProtectedExampleC{

	public static void main(String[] args) {
		
		ClassProtectedExampleA a = new ClassProtectedExampleA();
		//m1() has protected access in pack1.ClassProtectedExampleA
		//The method m1() from the type ClassProtectedExampleA is not visible
		//a.m1();
		
		ClassProtectedExampleC c = new ClassProtectedExampleC();
		//m1() has protected access in pack1.ClassProtectedExampleA
		//The method m1() from the type ClassProtectedExampleA is not visible
		//c.m1();
		
		ClassProtectedExampleD d = new ClassProtectedExampleD();
		d.m1();
		
		ClassProtectedExampleA a1 = new ClassProtectedExampleC();
		//m1() has protected access in pack1.ClassProtectedExampleA
		//The method m1() from the type ClassProtectedExampleA is not visible
		//a1.m1();
		
		ClassProtectedExampleA a2 = new ClassProtectedExampleD();
		//m1() has protected access in pack1.ClassProtectedExampleA
		//The method m1() from the type ClassProtectedExampleA is not visible
		//a1.m1();
		
		ClassProtectedExampleC c1 = new ClassProtectedExampleD();
		//m1() has protected access in pack1.ClassProtectedExampleA
		//The method m1() from the type ClassProtectedExampleA is not visible
		//c1.m1()
	}

}
