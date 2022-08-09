package com.learnjava.innerclasses;
public class OuterClass4 {
	public class InnerClass4 {
		public void m1() {
			System.out.println("M1 method");
		}
	}
	public static void main(String[] args) {
		/*
		 * Code1
		 */
		OuterClass4 o = new OuterClass4();
		OuterClass4.InnerClass4 i = o.new InnerClass4();
		i.m1();
		
		/*
		 * Combining first two lines in Code1 section
		 */
		
		OuterClass4.InnerClass4 i1 = new OuterClass4().new InnerClass4();
		i1.m1();
		
		/*
		 * Combining all lines into a single line in Code1 section
		 */
		new OuterClass4().new InnerClass4().m1();
	}
}
