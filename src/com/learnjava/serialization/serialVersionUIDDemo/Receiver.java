package com.learnjava.serialization.serialVersionUIDDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Receiver{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println("[i=" + d2.i+ "; j=" + d2.j +"]");
	}
}
