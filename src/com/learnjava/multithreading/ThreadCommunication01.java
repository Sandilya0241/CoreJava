package com.learnjava.multithreading;
class ThreadCommunication02 extends Thread {
	int total = 0;
	public void run() {
		synchronized(this) {
			System.out.println("Child thread starts calculation");
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			System.out.println("Child thread calling notify method");
			this.notify();
		}
	}
}
public class ThreadCommunication01 {
	public static void main(String[] args) throws InterruptedException{
		ThreadCommunication02 t = new ThreadCommunication02();
		t.start();
		synchronized (t) {
			System.out.println("Main thread entering into wait state by calling wait method");
			t.wait();
			System.out.println("Main thread got notification");
			System.out.println(t.total);
		}
	}
}
