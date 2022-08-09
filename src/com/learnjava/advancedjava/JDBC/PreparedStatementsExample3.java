package com.learnjava.advancedjava.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;


public class PreparedStatementsExample3 {

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
			
			pst.setInt(1, 127);
			
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rmd = rs.getMetaData();
			int colCount = rmd.getColumnCount();
			while(rs.next()) {
				for (int cnt = 1; cnt <= colCount; cnt++) {
					if (cnt != 1) {
						System.out.print("; ");
					}
					System.out.print(rmd.getColumnName(cnt) + " : " + rs.getObject(cnt)) ;
				}
				System.out.println("");
			}
			System.out.println("Debug point 1");
			rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Debug point 2");
				System.out.println(rs.getString("ENAME"));
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
