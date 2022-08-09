package com.learnjava.advancedjava.JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class PreparedStatementsExample5 {

	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("C:\\Users\\saakh\\git\\JavaRep\\src\\com\\learnjava\\advancedjava\\JDBC\\resources\\MyProperties.properties"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println(p.get("user"));
		Connection conn = null;
		try {
			Class.forName(p.getProperty("drivername"));
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(p.getProperty("url"),p);
			PreparedStatement pst =  conn.prepareStatement("DELETE FROM EMP1 WHERE ID = ?");
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Provide ID : ");
				int id = sc.nextInt();
				pst.setInt(1, id);
				
				int i = pst.executeUpdate();
				System.out.println(i + " record(s) deleted...");
				System.out.println("To input more records, press 1. Otherwise press anyother number");
				
				i = sc.nextInt();
				if(i != 1) {
					break;
				}
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		try {
			if(conn != null && conn.isClosed() != true) {
				conn.close();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
