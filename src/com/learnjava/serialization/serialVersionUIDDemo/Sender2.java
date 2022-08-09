package com.learnjava.serialization.serialVersionUIDDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender2{
	public static void main(String[] args) throws Exception{
		Dog2 d1 = new Dog2();
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
	}
}
