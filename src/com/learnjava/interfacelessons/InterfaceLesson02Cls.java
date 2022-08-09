package com.learnjava.interfacelessons;
import com.learnjava.interfacelessons.InterfaceLesson01Cls;
public class InterfaceLesson02Cls extends InterfaceLesson01Cls{
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.hashCode());
		InterfaceLesson02Cls obj = new InterfaceLesson02Cls();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}

class P {
	P() {
		System.out.println(this.hashCode());
	}
}

class C extends P {
	C() {
		System.out.println(this.hashCode());
	}
}
