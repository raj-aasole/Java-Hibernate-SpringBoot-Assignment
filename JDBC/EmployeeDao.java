package com.myJdbc.connection;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public static void insertEmployee(Employee e) throws Exception {

		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn.prepareStatement(
				"insert into Employee(eid,ename, gender, salary,deptid,designation) values(?,?,?,?,?,?)");
		pst.setInt(1, e.getEid());
		pst.setString(2, e.getEname());
		pst.setString(3, e.getGender());
		pst.setInt(4, e.getSalary());
		pst.setInt(5, e.getDeptid());
		pst.setString(6, e.getDesignation());

		pst.executeUpdate();
		conn.close();

	}

	public static void updateEmployee(Employee e) throws Exception {

		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn
				.prepareStatement("update employee set eid=?, ename=?, gender=?, salary=?, deptid=?, designation=? ");
		pst.executeUpdate();
		conn.close();

	}

	public static List<Employee> getAllEmployees() throws Exception {
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		Statement st = conn.createStatement();
		// st.executeQuery("select * from employee");

		ResultSet rs = st.executeQuery("select * from employee");

		while (rs.next())
			employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
					rs.getString(6)));

		return employees;

	}

	public static Object getEmployeeById(int id) throws Exception {
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn.prepareStatement("select * from employee where eid=?");
		pst.setInt(1, id);
		// Statement st=conn.createStatement();
		// st.executeQuery("select * from employee");

		ResultSet rs = pst.executeQuery();
		// st.set
		if (rs.next())
			return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
					rs.getString(6));
		else {
			System.out.println("employee with the Id not Found");
			return null;
		}

	}

	public static Object getEmployeeByName(String name) throws Exception {
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn.prepareStatement("select * from employee where ename=?");
		pst.setString(1, name);
		// Statement st=conn.createStatement();
		// st.executeQuery("select * from employee");

		ResultSet rs = pst.executeQuery();
		
		if (rs.next())
			return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
					rs.getString(6));
		else {
			System.out.println("employee with the Name not Found");
			return null;
		}

	}

	public static List<Employee> getEmployeesByDepartment(String department) throws Exception {
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn.prepareStatement("select * from employee where department=?");
		pst.setString(1, department);

		ResultSet rs = pst.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++)
			System.out.println(rsmd.getColumnName(i) + " has the type " + rsmd.getColumnTypeName(i));
		while (rs.next())
			employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
					rs.getString(6)));
		
		return employees;
	}

	public static void deleteEmployee(int id) throws Exception {
		Connection conn = ConnectionMaster.getConnection();
		CallableStatement cst = conn.prepareCall("{call delete_Employee(?)}");
		cst.setInt(1, id);
		cst.execute();
		conn.close();

	}

}
