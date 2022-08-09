package com.learnjava.collections;

import java.util.WeakHashMap;

public class WeakHashMapDemo2 {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap m = new WeakHashMap();
		Test t = new Test();
		m.put(t, "Sandy");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}

class Test {
	public String toString() {
		return "Test";
	}
	public void finalize() {
		System.out.println("Test finalize method got called");
	}
}