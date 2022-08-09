package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Type4DriverTest {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclgdb","employees_admin","employees_admin");
	}
}
