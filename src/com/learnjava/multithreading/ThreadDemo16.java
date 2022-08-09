package com.learnjava.multithreading;
class MyThread13 extends Thread {
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
public class ThreadDemo16{
	public static void main(String[] args) throws InterruptedException{
		MyThread13 t = new MyThread13();
		t.start();
		t.join(10000);
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
		}
	}
}
