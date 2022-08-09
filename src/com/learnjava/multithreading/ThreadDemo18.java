package com.learnjava.multithreading;
class MyThread15 extends Thread{
	static Thread mt;
	public void run() {
	
		try {
			mt.join();
		} catch (InterruptedException ie) {
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Sita Thread");
		}
	}
}
public class ThreadDemo18{
	public static void main(String[] args) throws InterruptedException{
		MyThread15 t = new MyThread15();
		MyThread15.mt = Thread.currentThread();
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
			Thread.sleep(2000);
		}
	}
}
