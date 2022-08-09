package com.learnjava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i = 10;
	transient int j = 20;
	static transient int k = 30;
	final transient int l = 50;
	public String toString() {
		return "[i = " + i + "; j = " + j  + ";  k = " + k  + ";  l= " + l  + "]";
	}
}

public class Demo01 {
	public static void main(String[] args) throws Exception{
		Dog d1 = new Dog();
		/* Serialization starts */
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		/* Serialization ends */
		
		/* Deserialization starts */
		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		/* Deserialization ends */
		
		System.out.println(d2);
	}
}
