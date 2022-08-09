package com.learnjava.multithreading;

class ParentThread extends Thread {
	public static InheritableThreadLocal itl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};
	public static ThreadLocal tl = new ThreadLocal();
	public void run() {
		itl.set("ITL-PP");
		tl.set("TL-PP");
		System.out.println("Parent thread THREADLOCAL value -- " + tl.get());
		System.out.println("Parent thread INHERITEDTHREADLOCAL value -- " + itl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread {
	public void run() {
		System.out.println("Child thread THREADLOCAL value -- " + ParentThread.tl.get());
		System.out.println("Child thread INHERITEDTHREADLOCAL value -- " + ParentThread.itl.get());
	}
}

public class InheritableThreadLocalDemo {
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
