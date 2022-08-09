package com.learnjava.multithreading;

class A1 {
	public synchronized void d1(B1 b) {
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

class B1 {
	public synchronized void d2(A1 a) {
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

public class DeadLockDemo2 extends Thread{
	A1 a = new A1();
	B1 b = new B1();
	
	public void m1() {
		this.start();
		a.d1(b);
	}
	
	public void run() {
		b.d2(a);
	}
	
	public static void main(String[] args) {
		DeadLockDemo2 d = new DeadLockDemo2();
		d.m1();
	}
}
