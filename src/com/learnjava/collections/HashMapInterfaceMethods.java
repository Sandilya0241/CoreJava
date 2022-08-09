package com.learnjava.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapInterfaceMethods {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Chiranjeevi", 700);
		m.put("Balaiah", 800);
		m.put("Nagarjuna", 500);
		m.put("Venkatesh", 200);
		System.out.println(m);
		System.out.println(m.put("Chiranjeevi", 1000));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry e = (Map.Entry)itr.next();
			System.out.println(e.getKey() + "..." + e.getValue());
			if(e.getKey().equals("Nagarjuna")) {
				e.setValue(10000);
			}
		}
		System.out.println(m);
	}
}
