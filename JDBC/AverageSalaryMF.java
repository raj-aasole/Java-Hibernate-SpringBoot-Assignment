package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AverageSalaryMF {

	public static void main(String[] args) {
		 try {     
			Connection conn = ConnectionMaster.getConnection();
	        Statement st=conn.createStatement();
	        
	        
	        //Avg salary by gender
	        ResultSet rs = st.executeQuery("select gender, AVG(salary) from employee GROUP BY gender;");
	        
	       
}	catch(Exception ex) {
System.out.println(ex.getMessage());
}
}
}
