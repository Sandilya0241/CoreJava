package com.learnjava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal3 {
	
	int i = 10;
	Animal3() {
		System.out.println("Animal class constructor called");
	}
}


class Dog3 extends Animal3 implements Serializable{
	
	int j = 20;
	Dog3() {
		System.out.println("Dog class constructor called");
	}
}

public class SerializationInheritanceDemo01 {

	public static void main(String[] args) {
		Dog3 d = new Dog3();
		try {
			FileOutputStream fos = new FileOutputStream("Dog3.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			
			System.out.println("Deserialization started");
			FileInputStream fis = new FileInputStream("Dog3.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog3 d2 = (Dog3)ois.readObject();
			System.out.println("Dog3 values  " + d2.i + " ... "+d2.j);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
