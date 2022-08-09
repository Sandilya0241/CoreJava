package com.learnjava.innerclasses;
public class OuterClass6Client {
	public static void main(String[] args) {
		OuterClass6 o = new OuterClass6();
		OuterClass6.InnerClass6 i = o.new InnerClass6();
		i.m1();
		
		OuterClass6.InnerClass6 i1 = new OuterClass6().new InnerClass6();
		i1.m1();
		
		new OuterClass6().new InnerClass6().m1();
	}
}

class OuterClass6 {
	public class InnerClass6 {
		public void m1() {
			System.out.println("M1 method");
		}
	}
}