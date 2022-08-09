package com.learnjava.collections;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueDemo2 {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue(15, new MyComparator16());
		p.offer("A");
		p.offer("Z");
		p.offer("L");
		p.offer("B");
		System.out.println(p);
	}
}
class MyComparator16 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}