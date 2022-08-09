package com.learnjava.oopsconcepts;

class OOPSConceptsLesson17 {
	void OOPSConceptsLesson17() {
		System.out.println("It's a method but not a Constructor");
	}
	public static void main(String[] args) {
		OOPSConceptsLesson17 o = new OOPSConceptsLesson17();
		o.OOPSConceptsLesson17();
		
		Test40 t = new Test40();
	}
}

class Test40 {
	
	Test40() {
		System.out.println("Test Constructor");
	}
}
