package com.myJdbc.connection;

import java.sql.*;

public class ResultMaster {
//	static String URL = "jdbc:mysql://localhost:3306/java";
//    static String USERNAME = "root";
//    static String PASSWORD = "aasole870";

   public static void main(String[] args) throws Exception {

       
      //  Class.forName("com.mysql.cj.jdbc.Driver");
   try {     Connection conn = ConnectionMaster.getConnection();
        Statement st=conn.createStatement();
    
  //  String sql="select*from employee";
    ResultSet rs=st.executeQuery("select * from employee");
    while(rs.next()) {
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6));
    }
   }catch (Exception ex) {
    	
    }
   }
}
