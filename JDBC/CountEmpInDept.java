package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountEmpInDept {
	public static void main(String[] args) {
		try {
			Connection con=ConnectionMaster.getConnection();
			Statement st=con.createStatement();
			
			ResultSet r=st.executeQuery("select deptid, COUNT(*) FROM employee GROUP BY deptid;");
			
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	

}
