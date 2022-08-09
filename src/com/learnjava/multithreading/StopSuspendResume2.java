package com.learnjava.multithreading;
class ThreadW extends Thread {
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
		}
	}
}
public class StopSuspendResume2 {

	public static void main(String[] args) {
		ThreadW t = new ThreadW();
		t.start();
		System.out.println("Main thread execution completed");
		t.stop();
	}
}


