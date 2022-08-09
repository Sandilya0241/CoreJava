package com.learnjava.advancedjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclgdb", "employees_admin", "employees_admin");
			Statement stmt = conn.createStatement();
			boolean blnCreated = stmt.execute("CREATE TABLE EMP1(ID NUMBER, ENAME VARCHAR2(100), DEPT VARCHAR2(50), DOB DATE)");
			if(blnCreated) {
				System.out.println("Created successfully");
			} else {
				System.out.println("TABLE creation failed");
			}
			conn.commit();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		try {
			if(conn != null && !conn.isClosed())
				conn.close();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
