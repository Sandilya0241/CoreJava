package com.learnjava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rat2  implements Serializable{
	int j = 20;
}

class Cat2  implements Serializable{
	Rat2 r = new Rat2();
}

class Dog2 implements Serializable{
	Cat2 c = new Cat2();
}

public class ObjectGraphDemo01 {
	public static void main(String[] args) throws Exception{
		Dog2 d1 = new Dog2();
		/* Serialization starts */
		FileOutputStream fos = new FileOutputStream("dog2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		/* Serialization ends */
		
		/* Deserialization starts */
		FileInputStream fis = new FileInputStream("dog2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog2 d2 = (Dog2)ois.readObject();
		/* Deserialization ends */
		
		System.out.println(d2.c.r.j);
	}
}
