package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMaster {
	static String URL = "jdbc:mysql://localhost:3306/java";
	static String USERNAME = "root";
  	static String PASSWORD = "aasole870";
  	
  	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			
			Connection conn = ConnectionMaster.getConnection();
			PreparedStatement pst = conn.prepareStatement("delete from employee where eid=?");
			System.out.println("please enter Employee id");
		    pst.setInt(1, Integer.parseInt(sc.nextLine()));
		    
		    pst.executeUpdate();
		     
		    conn.close();
}			catch (Exception ex){
}
}
}