package com.learnjava.declarationsandaccessmodifiers;

public class DclrNAcssMod005 {
	/*
	 * 
	 * final method example
	 * Whatever methods Parent has are available to the by default through Inheritance. 
	 * If the child, not satisfied with Parent method implementation, then child is allowed to redefine that method based on its requirement. This process is called Overriding.
	 * If the parent class method is declared as 'final' then we can't Override that method in the child class because it's implementation is 'final'.
	 */
	public class classParent {
		public void property () {
			System.out.println("Ca$h+Gold+Land");
		}
		public /*final*/ void marriage () {
			System.out.println("ABC");
		}
	}
	
	public class classChild extends classParent{
		
		public void marriage () { //Cannot override the final method from DclrNAcssMod005.classParent
			System.out.println("KAREENA");
		}
	}
	
	/*
	 * 
	 * final method example
	 * If a class declared as final, we can't extend functionality of that class i.e., we can't create child class for that class i.e., 
	 * Inheritance is not possible for final classes.
	 */
	
	/*final*/ class classParent1 {
		
	}
	
	class classChild1 extends classParent1 {
		
	}
}
