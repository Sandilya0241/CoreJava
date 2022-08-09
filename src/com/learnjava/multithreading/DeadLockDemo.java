package com.learnjava.multithreading;

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1 starts execution of A's d1() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}
		System.out.println("Thread1 trying to call B's last method");
		b.last();
	} 
	public synchronized void last() {
		System.out.println("Inside A's last() method");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread2 starts execution of B's d2() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}
		System.out.println("Thread2 trying to call A's last method");
		a.last();
	} 
	public synchronized void last() {
		System.out.println("Inside A's last() method");
	}
}

public class DeadLockDemo{
	A a = new A();
	B b = new B();
	
	public void m1() {
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.activeCount());
				b.d2(a);
			}
		});
		t.start();
		a.d1(b);
	}
	
	public static void main(String[] args) {
		DeadLockDemo d = new DeadLockDemo();
		d.m1();
	}
}
