package com.learnjava.multithreading;
class ThreadD extends Thread{
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
public class DaemonThreadDemo2 {
	public static void main(String[] args) {
		ThreadD t = new ThreadD();
		t.setDaemon(true);
		t.start();
		System.out.println("Main thread execution ends");
	}
}
