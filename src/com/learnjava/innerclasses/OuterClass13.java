package com.learnjava.innerclasses;
public class OuterClass13 {
	public static void main(String[] args) {
		PopCorn p1 = new PopCorn() {
			public void taste() {
				System.out.println("Spicy");
			}
		};
		p1.taste();
		
		PopCorn p2 = new PopCorn();
		p2.taste();
		
		PopCorn p3 = new PopCorn() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		p3.taste();
		
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
		System.out.println(p3.getClass().getName());
	}
}

class PopCorn {
	public void taste() {
		System.out.println("Salty");
	}
}
