package com.learnjava.multithreading;

public class ThreadDemo8{
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

/*
 * O/P:
 * 	Main Thread
	Main Thread
	Main Thread
	Main Thread
	Main Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Main Thread
	Main Thread
	Main Thread
	Main Thread
	Main Thread
 * 
 * 
 */