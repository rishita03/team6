package com.cg.oicrs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	static Connection conn;
	
	public static Connection getConnection() throws SQLException {
		
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","SYSTEM","sairam");
		return conn;
		
	}

}
