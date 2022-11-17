package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyJdbcClass {
	static String URL="jdbc:mysql://localhost:3306/java";
	static String USERNAME ="root";
	static String PASSWORD="aasole870";
		
	public static void main(String[] args) {
		 try {
			 	//Inserting data into table
			 
	            Scanner sc = new Scanner(System.in);
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	            PreparedStatement pst = conn.prepareStatement("insert into employee(eid , ename , gender, salary , deptid , designation) values(?,?,?,?,?,?)");
	            System.out.println("please enter id");
	            pst.setInt(1, Integer.parseInt(sc.nextLine()));
	            System.out.println("please enter employee name");
	            pst.setString(2, sc.nextLine());
	            System.out.println("please enter employee's gender");
	            pst.setString(3, sc.nextLine());
	            System.out.println("please enter employee salary");
	            pst.setInt(4, Integer.parseInt(sc.nextLine()));
	            System.out.println("please enter employee deptid");
	            pst.setInt(5, Integer.parseInt(sc.nextLine()));
	            System.out.println("please enter employee designation");
	            pst.setString(6, sc.nextLine());
	            
	            //execute the update
	            pst.executeUpdate();
	          
	            //close the connection
	            conn.close();
	            
	        }catch(Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	}
	}