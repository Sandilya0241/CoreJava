package com.learnjava.serialization.serialVersionUIDDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver2{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog2 d2 = (Dog2)ois.readObject();
		System.out.println("[i=" + d2.i+ "; j=" + d2.j +"]");
	}
}
