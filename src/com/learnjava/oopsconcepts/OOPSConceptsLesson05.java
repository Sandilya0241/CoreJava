package com.learnjava.oopsconcepts;

import java.io.*;

public class OOPSConceptsLesson05 {

}

class P3 {
	public void m1() throws Exception {}
	public void m2() {}
	public void m3() throws Exception{}
	public void m4() throws IOException{}
	public void m5() throws IOException{}
	public void m6() throws IOException{}
	public void m7() throws IOException{}
}

class C3 extends P3{
	public void m1() {}
	//public void m2() throws Exception {}	// CE: m1() in C cannot override m1() in P; Overridden method does not throw java.lang.InterruptedException.
	public void m3() throws IOException{}
	//public void m4() throws Exception{} // CE: m1() in C cannot override m1() in P; Overridden method does not throw java.lang.InterruptedException.
	public void m5() throws EOFException, FileNotFoundException{}
//	public void m6() throws EOFException,InterruptedException{}// CE: m1() in C cannot override m1() in P; Overridden method does not throw java.lang.InterruptedException.
	public void m7() throws NullPointerException,ArithmeticException,ClassCastException{}
}