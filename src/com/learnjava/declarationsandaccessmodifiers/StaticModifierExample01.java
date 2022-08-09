package com.learnjava.declarationsandaccessmodifiers;

public class StaticModifierExample01 {
	static int x = 10;
	int y = 20;
	public static void main(String[] args) {
		StaticModifierExample01 o1 = new StaticModifierExample01();
		o1.x = 888;
		o1.y = 999;
		StaticModifierExample01 o2 = new StaticModifierExample01();
		System.out.println(o2.x + "..." + o2.y);
	}
}
