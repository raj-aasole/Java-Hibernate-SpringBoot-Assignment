package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountNoEmpDepartment {

	public static void main(String[] args) {
		 try {     Connection conn = ConnectionMaster.getConnection();
	        Statement st=conn.createStatement();
	        
	        ResultSet rs = st.executeQuery(" count employee eid, ename ,designation from employee where designation='Manager'");
}catch(Exception ex) {
System.out.println(ex.getMessage());
}
}
}
