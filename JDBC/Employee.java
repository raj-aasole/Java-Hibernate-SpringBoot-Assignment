package com.myJdbc.connection;

public class Employee {
	int eid;
	String ename;
	String gender;
	int deptid;
	int salary;
	String designation;
	
	public Employee() {}


	public Employee(int eid, String ename,String gender, int deptid, int salary, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.gender=gender;
		this.deptid = deptid;
		this.salary = salary;
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", gender=" + gender + ", deptid=" + deptid + ", salary="
				+ salary + ", designation=" + designation + "]";
	}
	
	

}
