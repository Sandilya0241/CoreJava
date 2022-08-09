package com.learnjava.advancedjava.JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class PreparedStatementsExample4 {

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
			PreparedStatement pst =  conn.prepareStatement("INSERT INTO EMP1 VALUES (?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Provide ID : ");
				int id = sc.nextInt();
				pst.setInt(1, id);
				
				System.out.println("Provide Name : ");
				String name = sc.next();
				pst.setString(2, name);
				
				System.out.println("Provide Department name : ");
				String deptname = sc.next();
				pst.setString(3, deptname);
				
				System.out.println("Provide DOB (in YYYY-MM-DD format) : ");
				String strDt = sc.next();
				pst.setDate(4, java.sql.Date.valueOf(strDt));
				
				int i = pst.executeUpdate();
				System.out.println("Record with id : " + id + " successfully inserted...");
				System.out.println(i + " record(s) inserted...");
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
