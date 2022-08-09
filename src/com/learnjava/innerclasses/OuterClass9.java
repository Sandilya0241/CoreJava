package com.learnjava.innerclasses;
public class OuterClass9 {
	int x = 10;
	public class InnerClass8 {
		int x = 100;
		public class InnerMostClass8 {
			int x = 1000;
			public void m1() {
				int x = 10000;
				System.out.println(x);
				System.out.println("this.x : " + this.x);
				System.out.println("InnerClass8.this.x : " + InnerClass8.this.x);
				System.out.println("OuterClass8.this.x : " + OuterClass9.this.x);
			}
		}
	}	
	public static void main(String[] args) {
		new OuterClass9().new InnerClass8().new InnerMostClass8().m1();
	}
}