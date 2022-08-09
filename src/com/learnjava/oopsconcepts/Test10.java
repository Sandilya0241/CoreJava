package com.learnjava.oopsconcepts;

class Test10 {
	{
		System.out.println("First Instance Block");
	}

	static {
		System.out.println("First Static Block");    
	}

	Test10() {
		System.out.println("Constructor");           
	}
	
	public static void main(String[] args) {	
		Test10 b = new Test10();                      
		System.out.println("Main Method");        
		Test10 b1 = new Test10();                     
	}

	static {   
		System.out.println("Second Static Block");
	}

	{
		System.out.println("Second Instance Block");
	}
}
