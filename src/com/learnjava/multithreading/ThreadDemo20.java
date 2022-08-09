package com.learnjava.multithreading;
class MyThread16 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I'm a lazy thread, Child thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException ie) {
			System.out.println("I'm interrupted, Child thread");
		}
	}
}
public class ThreadDemo20{
	public static void main(String[] args) throws InterruptedException{
		MyThread16 t = new MyThread16();
		t.start();
		//t.interrupt();
		System.out.println("End of Main thread");
	}
}
