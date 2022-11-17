package com.myJdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ByDesignation {

	public static void main(String[] args) {
		try {
			Connection conn = ConnectionMaster.getConnection();
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("select eid, ename , salary, deptid, designation from employee where designation='Manager'");

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
