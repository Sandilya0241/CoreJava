package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson08 {

	public static void main(String[] args) {
		Parent7 p = new Parent7();
		Child7 c = new Child7();
		Parent7 p1 = new Child7();
		
		System.out.println("NON-STATIC - NON-STATIC COMBINATION");
		System.out.println(p.w);
		System.out.println(c.w);
		System.out.println(p1.w);
		
		System.out.println("STATIC - NON-STATIC COMBINATION");
		System.out.println(p.x);
		System.out.println(c.x);
		System.out.println(p1.x);
		
		System.out.println("NON-STATIC - STATIC COMBINATION");
		System.out.println(p.y);
		System.out.println(c.y);
		System.out.println(p1.y);
		
		System.out.println("STATIC - STATIC COMBINATION");
		System.out.println(p.z);
		System.out.println(c.z);
		System.out.println(p1.z);
	}
}

class Parent7 {
	int w = 888;
	static int x = 888;
	int y = 888;
	static int z = 888;
}
class Child7 extends Parent7 {
	int w = 999;
	int x = 999;
	static int y = 999;
	static int z = 999;
}
