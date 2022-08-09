package com.learnjava.multithreading;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;
class ThreadForLockDemos4 extends Thread {
	ThreadForLockDemos4(String name) {
		super(name);
	}
	static ReentrantLock l = new ReentrantLock();
	
	public void run() {
		try {
			do {
				if(l.tryLock(5000,TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " got the lock.");
					try {
						Thread.sleep(30000);
					} catch (InterruptedException ie) {
					}
					l.unlock();
					System.out.println(Thread.currentThread().getName() + " releasing the lock.");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " didn't get the lock. So, waiting for lock.");
				}
			} while(true);
		} catch (InterruptedException ie) {
		}
	}
}

public class ReentrantLockDemo4 {
	public static void main(String[] args) throws InterruptedException{
		ThreadForLockDemos4 t1 = new ThreadForLockDemos4("First Thread");
		ThreadForLockDemos4 t2 = new ThreadForLockDemos4("Second Thread");
		t1.start();
		t2.start();
	}
}
