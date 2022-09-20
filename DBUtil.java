package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn=null;
	public Connection getConnection(){
		
   	 if(conn==null) {
		 
		 //DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		 try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//step2 ---get connection
			//conn=DriverManager.getConnection("jdbc:derby:C:\\mydata\\firstdb");
		 try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","12345");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//conn.setAutoCommit(false);
			if(conn!=null) {
				System.out.println("connection done");
				return conn;
				
			}
			else {
				System.out.println("not done");
				return null;
			}
	  
	 }
		return null;
		
		
	}

}
