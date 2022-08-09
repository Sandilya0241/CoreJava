package com.learnjava.oopsconcepts;

public class Test30 {
	static int countOfObjects = 0;
	{
		countOfObjects++;
	}
	Test30() {
		this(10);
//		countOfObjects++;
	}
	Test30 (int i) {
//		countOfObjects++;
	}
	
	Test30(double d) {
//		countOfObjects++;
	}
	public static void main(String[] args) {
		Test30 t1 = new Test30();
		Test30 t2 = new Test30(10);
		Test30 t3 = new Test30(10.5);
		System.out.println("Number of Objects created : " + countOfObjects);
	}

}
