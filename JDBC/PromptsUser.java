package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PromptsUser {
	
	public static void main(String[] args) {
		 try {    
			Scanner sc= new Scanner(System.in);
			 
			Connection conn = ConnectionMaster.getConnection();
	        Statement st=conn.createStatement();
	        
	        ResultSet rs = st.executeQuery("select *from employee where salary=(select Max(salary) from employee);");
	       
	       
}	catch(Exception ex) {
System.out.println(ex.getMessage());
}
}
}
