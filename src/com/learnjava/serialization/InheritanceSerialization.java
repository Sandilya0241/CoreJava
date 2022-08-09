package com.learnjava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	int i = 10;
} 

class Dog4 extends Animal {
	int j = 20;
	
	@Override
	public String toString() {
		return "Dog4 [j=" + j + "]";
	}
	
}

public class InheritanceSerialization {

	public static void main(String[] args) {
		try {
			Dog4 d1 = new Dog4();
			FileOutputStream fos = new FileOutputStream("inheritSer.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);
			
			FileInputStream fis = new FileInputStream("inheritSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog4 d2 = (Dog4)ois.readObject();
			
			System.out.println(d2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
