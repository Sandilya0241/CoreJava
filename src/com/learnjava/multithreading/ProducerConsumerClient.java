package com.learnjava.multithreading;
import java.util.LinkedList;
public class ProducerConsumerClient {
	public static void main(String[] args) throws InterruptedException{
		final ProducerConsumer pc = new ProducerConsumer();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	public static class ProducerConsumer{
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;
		
		public void produce() throws InterruptedException{
			int value = 0;
			while(true) {
				synchronized (this) {
					if (list.size() == capacity) {
						this.wait();
					}
					System.out.println("Producer produced - " + value);
					list.add(value++);
					this.notify();
					Thread.sleep(1000);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true) {
				synchronized (this) {
					if (list.size() == 0) {
						this.wait();
					}
					int val = list.removeFirst();
					System.out.println("Consumer consume - " + val);
					this.notify();
					Thread.sleep(1000);
				}
			}
		}
	}
}
