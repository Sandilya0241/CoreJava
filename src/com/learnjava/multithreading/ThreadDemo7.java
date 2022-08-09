package com.learnjava.multithreading;

public class ThreadDemo7 extends Thread{
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		System.out.println("Main method");
		t.start();
	}
}

/*
 * > javac -d . ThreadDemo7.java
   > java com.learnjava.multithreadingThreadDemo7
	Error: Could not find or load main class com.learnjava.multithreadingThreadDemo7
	Caused by: java.lang.ClassNotFoundException: com.learnjava.multithreadingThreadDemo7
 * 
 */
