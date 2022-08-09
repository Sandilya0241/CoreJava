package com.learnjava.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable{

	String s;
	int i;
	int j;
	
	public ExternalizationDemo() {
		System.out.println("This is a call to no-arg constructor");
	}
	
	public ExternalizationDemo(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String)in.readObject();
		i = in.readInt();
	}
	
	public static void main(String[] args) throws Exception{
		ExternalizationDemo extD1 = new ExternalizationDemo("Sandy",1,2);
		FileOutputStream fos = new FileOutputStream("abc.ext");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(extD1);
		
		FileInputStream fis = new FileInputStream("abc.ext");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo extD2 =  (ExternalizationDemo)ois.readObject();
		System.out.println("[s=" + extD2.s + "; i=" + extD2.i + "; j=" + extD2.j + "]");
	}
}
