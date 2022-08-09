package com.learnjava.collections;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\saakh\\git\\JavaRep\\src\\com\\learnjava\\collections\\abc.properties");
			p.load(fis);	
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch (IOException ioe) {
			// TODO: handle exception
		}
		System.out.println(p);
		String name = p.getProperty("username");
		System.out.println(name);
		p.setProperty("property1", "Value1");
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\saakh\\git\\JavaRep\\src\\com\\learnjava\\collections\\abc.properties");
			p.store(fos, "Updated by Sandilya.");
		} catch (FileNotFoundException fnfe) {
		} catch (IOException ioe) {
		}
	}
}
