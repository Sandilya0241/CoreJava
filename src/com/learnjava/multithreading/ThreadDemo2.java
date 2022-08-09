package com.learnjava.multithreading;

public class ThreadDemo2 extends Thread{
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.run();
		for(int cnt = 0; cnt < 10; cnt++) {
			System.out.println("Main Thread");
		}
		System.out.println("Main Thread ends");
	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}