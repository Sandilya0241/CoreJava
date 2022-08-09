package com.learnjava.multithreading;
class MyThread14 extends Thread{
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
public class ThreadDemo17{
	public static void main(String[] args) throws InterruptedException{
		MyThread14 t = new MyThread14();
		MyThread14.mt = Thread.currentThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
			Thread.sleep(2000);
		}
	}
}
