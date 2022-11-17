package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SecondHighest {
	
	public static void main(String[] args) {
		 try {     
			Connection conn = ConnectionMaster.getConnection();
	        Statement st=conn.createStatement();
	        
	        
	        ResultSet rs = st.executeQuery("select distinct(salary) from employee order BY salary DESC LIMIT 1,1;");
	        // select *from employee where salary=(select Max(salary) from employee);
}	catch(Exception ex) {
System.out.println(ex.getMessage());
}
}

	

}
