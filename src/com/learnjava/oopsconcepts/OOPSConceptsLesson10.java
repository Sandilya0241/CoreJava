package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson10 {
	public static void main(String[] args) {
//		Object o = new String("Sandy");
//		StringBuffer sb = (StringBuffer) o;
//		System.out.println(sb);
		
//		String s = new String("Sandy");
//		StringBuffer sb1 = (StringBuffer) s;
		Object o = new String("Sandy");
		Object o1 = (String) o;
		System.out.println(o1);
	}
}
