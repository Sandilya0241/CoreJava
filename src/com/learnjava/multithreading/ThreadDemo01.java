package com.learnjava.multithreading;

public class ThreadDemo01 extends Thread{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for(int cnt = 0; cnt < 10; cnt++) {
			System.out.println("Main Thread");
		}
		System.out.println("Main Thread ends");
	}
}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}