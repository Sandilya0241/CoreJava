package com.learnjava.oopsconcepts;

public class SingletonExampleTest {
	public static void main(String[] args) {
		SingletonExample s1 = SingletonExample.getInstance();
		System.out.println(s1);
		SingletonExample s2 = SingletonExample.getInstance();
		System.out.println(s2);
	}
}
