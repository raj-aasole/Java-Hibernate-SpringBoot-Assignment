package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ThirdHighest  {
	
	public static void main(String[] args) throws SQLException {
		try {
			
		//Third Highest salary from the list
		Connection conn=ConnectionMaster.getConnection();
		Statement s=conn.createStatement();
		
		ResultSet rs= s.executeQuery("select distinct(salary) from employee order by Salary DESC LIMIT 2,1;");
		
		
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
