package com.learnjava.multithreading;
class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good morning : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
			System.out.println(name);
		}
	}
}
class MyThread18 extends Thread {
	Display d;
	String name;
	MyThread18(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread18 t1 = new MyThread18(d, "Dhoni");
		MyThread18 t2 = new MyThread18(d, "YuvRaj");
		t1.start();
		t2.start();
	}
}
