package com.learnjava.multithreading;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;
class ThreadForLockDemos3 extends Thread {
	ThreadForLockDemos3(String name) {
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

public class ReentrantLockDemo5 {
	public static void main(String[] args) {
		ThreadForLockDemos3 t1 = new ThreadForLockDemos3("First Thread");
		ThreadForLockDemos3 t2 = new ThreadForLockDemos3("Second Thread");
		t1.start();
		t2.start();
	}
}
