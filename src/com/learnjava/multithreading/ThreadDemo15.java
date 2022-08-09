package com.learnjava.multithreading;
class MyThread12 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ie) {
			}
		}
	}
}
public class ThreadDemo15{
	public static void main(String[] args) throws InterruptedException{
		MyThread12 t = new MyThread12();
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
		}
	}
}
