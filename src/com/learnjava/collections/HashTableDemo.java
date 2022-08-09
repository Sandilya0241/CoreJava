package com.learnjava.collections;
import java.util.Hashtable;
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Test15(5), "A");
		h.put(new Test15(2), "B");
		h.put(new Test15(6), "C");
		h.put(new Test15(15), "D");
		h.put(new Test15(23), "E");
		h.put(new Test15(16), "F");
		//h.put(new Test15(17), null);
		//h.put(null, "K");
		System.out.println(h);
	}
}
class Test15 {
	int i;
	Test15(int i) {
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i + "";
	}
}
