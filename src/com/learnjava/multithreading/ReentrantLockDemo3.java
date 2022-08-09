package com.learnjava.multithreading;
import java.util.concurrent.locks.*;
class ThreadForLockDemos2 extends Thread {
	ThreadForLockDemos2(String name) {
		super(name);
	}
	static ReentrantLock l = new ReentrantLock();
	
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " got the lock and started execution");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ie) {
			}
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + " didn't get the lock. So, performing alternative operations.");
		}
	}
}

public class ReentrantLockDemo3 {
	public static void main(String[] args) {
		ThreadForLockDemos2 t1 = new ThreadForLockDemos2("First Thread");
		ThreadForLockDemos2 t2 = new ThreadForLockDemos2("Second Thread");
		t1.start();
		t2.start();
	}
}
