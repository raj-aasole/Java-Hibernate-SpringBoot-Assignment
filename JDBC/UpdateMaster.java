package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateMaster {
	
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			
			Connection conn = ConnectionMaster.getConnection();
			PreparedStatement pst = conn.prepareStatement("update employee set ename=?, salary=?, deptid=?, designation=? where eid=?");
			System.out.println("please enter id");
            pst.setInt(5, Integer.parseInt(sc.nextLine()));
            System.out.println("please enter employee name");
            pst.setString(1, sc.nextLine());
            System.out.println("please enter employee salary");
            pst.setInt(2, Integer.parseInt(sc.nextLine()));
            System.out.println("please enter employee deptid");
            pst.setInt(3, Integer.parseInt(sc.nextLine()));
            System.out.println("please enter employee designation");
            pst.setString(4, sc.nextLine());
			
            
            //execute the update query
            pst.executeUpdate();
            
            //closing jdbc connection
            conn.close();
			
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
