package com.learnjava.multithreading;
class Display3 {
	public synchronized void displayN() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
		}
	}
	public synchronized void displayC() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
		}
	}
}
class MyThread20 extends Thread {
	Display3 d;
	MyThread20(Display3 d) {
		this.d = d;
	}
	public void run() {
		d.displayN();
	}
}
class MyThread21 extends Thread {
	Display3 d;
	String name;
	MyThread21(Display3 d) {
		this.d = d;
	}
	public void run() {
		d.displayC();
	}
}
public class SynchronizedDemo3 {
	public static void main(String[] args) {
		Display3 d = new Display3();
		MyThread20 t1 = new MyThread20(d);
		MyThread21 t2 = new MyThread21(d);
		t1.start();
		t2.start();
	}
}
