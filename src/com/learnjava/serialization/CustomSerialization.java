package com.learnjava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String userName = "Sandy";
	transient String password = "Sandy123";
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String ePassword = "123" + password;
		oos.writeObject(ePassword);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String ePassword = (String)ois.readObject();
		password = ePassword.substring(3);
	}
	
	public String toString() {
		return "[Username : " + userName + "; Password : " + password + "]";
	}
}

public class CustomSerialization {

	public static void main(String[] args) {
		Account a1 = new Account();
		try {
			FileOutputStream fos = new FileOutputStream("account.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);
			
			FileInputStream fis = new FileInputStream("account.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Account a2 = (Account)ois.readObject();
			System.out.println(a2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
