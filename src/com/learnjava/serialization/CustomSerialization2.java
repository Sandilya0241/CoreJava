package com.learnjava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account2 implements Serializable{
	String userName = "Sandy";
	transient String password = "Sandy123";
	transient int pin = 1234;
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String ePassword = "123" + password;
		int ePin = 4444 + pin;
		oos.writeObject(ePassword);
		oos.writeInt(ePin);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String ePassword = (String)ois.readObject();
		password = ePassword.substring(3);
		pin = (int)ois.readInt() - 4444;
	}
	
	public String toString() {
		return "[Username : " + userName + "; Password : " + password + "; Pin : " + pin + "]";
	}
}

public class CustomSerialization2 {

	public static void main(String[] args) {
		Account2 a1 = new Account2();
		try {
			FileOutputStream fos = new FileOutputStream("account2.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);
			
			FileInputStream fis = new FileInputStream("account2.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Account2 a2 = (Account2)ois.readObject();
			System.out.println(a2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
