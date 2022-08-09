package com.learnjava.multithreading;
class MyThread11 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class ThreadDemo14{
	public static void main(String[] args) {
		MyThread11 t = new MyThread11();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}
}
