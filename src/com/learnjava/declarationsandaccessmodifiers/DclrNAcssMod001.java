package com.learnjava.declarationsandaccessmodifiers;

import java.util.Date;
import java.sql.*;

public class DclrNAcssMod001 {

	public static void main(String[] args) {
		Date d = new Date();	// Date type is ambiguous
		System.out.println(d.getClass().getName());
	}

}
