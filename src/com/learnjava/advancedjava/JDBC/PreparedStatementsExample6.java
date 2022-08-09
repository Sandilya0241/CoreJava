package com.learnjava.advancedjava.JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class PreparedStatementsExample6 {

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
			PreparedStatement pst =  conn.prepareStatement("SELECT * FROM EMP1 WHERE ID = ?");
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Provide ID : ");
				int id = sc.nextInt();
				pst.setInt(1, id);
				
				ResultSet rs = pst.executeQuery();
				ResultSetMetaData rmd = rs.getMetaData();
				int colCount = rmd.getColumnCount();
				while(rs.next()) {
					System.out.println("==========================================");
					for (int cnt = 1; cnt <= colCount; cnt++) {
						
						if(cnt != 1)
							System.out.print("; ");
						
						System.out.print(rmd.getColumnLabel(cnt) + ":" + rs.getObject(cnt));
					}
					System.out.println("");
				}
				
				System.out.println("==========================================");
				System.out.println("To input more records, press 1. Otherwise press anyother number");
				
				int i = sc.nextInt();
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
