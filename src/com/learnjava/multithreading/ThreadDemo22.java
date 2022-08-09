package com.learnjava.multithreading;
class MyThread17 extends Thread {
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("I'm Lazy thread - " + i);
		}
		System.out.println("I'm going to sleep");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("I'm interrupted");
		}
	}
}
public class ThreadDemo22{
	public static void main(String[] args) throws InterruptedException{
		MyThread17 t = new MyThread17();
		t.start();
		t.interrupt();
		System.out.println("Main thread end");
	}
}
