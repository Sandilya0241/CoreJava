package com.learnjava.oopsconcepts;

public class SingletonExample {
	private static SingletonExample singletonInstance = new SingletonExample();
	private SingletonExample() {
	}
	public static SingletonExample getInstance() {
		return singletonInstance;
	}
}
