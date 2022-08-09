package com.learnjava.serialization.serialVersionUIDDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sender{
	public static void main(String[] args) throws Exception{
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
	}
}
