package com.learnjava.oopsconcepts;

public class SingletonExample2 {
	private static SingletonExample2 singletonInstance = null;
	private SingletonExample2() {
	}
	public static SingletonExample2 getInstance() {
		if(singletonInstance == null) {
			singletonInstance = new SingletonExample2();
		}
		return singletonInstance;
	}
}
