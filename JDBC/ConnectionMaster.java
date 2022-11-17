package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMaster {
	
	static String URL="jdbc:mysql://localhost:3306/java";
	static String USERNAME ="root";
	static String PASSWORD="aasole870";
	
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return conn;
		} catch(Exception ex) {
			return null;
		}
	}

}
