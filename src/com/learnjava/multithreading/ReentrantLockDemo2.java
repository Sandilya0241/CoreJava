package com.learnjava.multithreading;
import java.util.concurrent.locks.*;

class Display15 {
	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("Good morning : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
			System.out.println(name);
			
		}
		l.unlock();
	}
}

class ThreadForLockDemos1 extends Thread {
	
	Display15 d;
	String name;
	
	ThreadForLockDemos1(Display15 d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class ReentrantLockDemo2 {
	public static void main(String[] args) {
		Display15 d = new Display15();
		ThreadForLockDemos1 t1 = new ThreadForLockDemos1(d, "Dhoni");
		ThreadForLockDemos1 t2 = new ThreadForLockDemos1(d, "Yuvraj");
		t1.start();
		t2.start();
	}
}
