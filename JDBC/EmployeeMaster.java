package com.myJdbc.connection;

public class EmployeeMaster {

	public static void main(String[] args) {
		Employee e = new Employee(6, "alex","male", 20, 20000, "Developer");
		try {
		//	EmployeeDao.insertEmployee(e);
		//	EmployeeDao.updateEmployee(e);
		//	System.out.println(EmployeeDao.getEmployeeByName("ankush"));
		//	System.out.print(EmployeeDao.getAllEmployees());
			
		//	System.out.println(EmployeeDao.getEmployeesByDepartment("Sales"));
		//	EmployeeDao.getAllEmployees().stream().forEach(System.out::println);
			EmployeeDao.deleteEmployee(2);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
//Collable statement with out parameter