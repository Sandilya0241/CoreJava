package com.learnjava.multithreading;
class MyThread10 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class ThreadDemo13{
	public static void main(String[] args) {
		MyThread10 t = new MyThread10();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
}
