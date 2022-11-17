package com.objectclass.assignment;

import java.util.Scanner;

public class Employee {
	
	     private static int emp_number;
	     private static String emp_name;
	     private static double basic;
	     double net_salary;
	     double it;
	     double gross_salary;
	     double da;
	    
	     
	    
	    public Employee() {
	        super();
	        
	    }
	    public Employee(int emp_number, String emp_name, double basic) {
	        super();
	        this.emp_number = emp_number;
	        this.emp_name = emp_name;
	        this.basic = basic;
	        //this.net_salary = net_salary;
	        //this.it = it;
	        //this.gross_salary = gross_salary;
	        //this.da = da;
	    }
	    @Override
	    public String toString() {
	        return "Employee [emp_number=" + emp_number + ", emp_name=" + emp_name + ", basic=" + basic + ", net_salary="
	                + net_salary + ", it=" + it + ", gross_salary=" + gross_salary + ", da=" + da + "]";
	    }
	    public void read() {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the Employee number: ");
	        
	        emp_number=sc.nextInt();
	        
	        System.out.println("Enter employee name: ");
	        
	        emp_name= sc.next();
	        
	        System.out.println("Enter Employee basic salary: ");
	        
	        basic=sc.nextInt();         
	    }
	    public double Calculate() {
	        
	         da = basic * 0.52;
	          gross_salary = basic + da;
	          it = gross_salary * 0.30;
	          net_salary = (basic + da) - it;
	          return net_salary;
	        
	    }
	   void display()
	    {
	        System.out.println("Employee Details");
	        
	        System.out.println("Employee number: "+emp_number);
	        
	        System.out.println("Employee name: "+emp_name);
	        
	        System.out.println("Employee net salary"+net_salary);}
	    
	    public static void main(String[] args) {
	    
	        Employee emp = new Employee(emp_number,emp_name ,basic);
	        //Employee emp = new Employee();
	        emp.read();
	        emp.Calculate();
	        emp.display();}
	}

	//has context menu
	
//	private int empId;
//	private String name;
//	private String basicSalary;
//	private String dA;
//	private String IT;
//	private String netSalary;
//	private String grossSalary;
//		
//	public Employee() {
//		super();
//	}
//
//	public Employee(int empId, String name, String basicSalary, String netSalary) {
//		super();
//		this.empId = empId;
//		this.name = name;
//		this.basicSalary = basicSalary;
//		this.netSalary = netSalary;
//		this.grossSalary = grossSalary;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getBasicSalary() {
//		return basicSalary;
//	}
//
//	public void setBasicSalary(String basicSalary) {
//		this.basicSalary = basicSalary;
//	}
//
//	public String getdA() {
//		return dA;
//	}
//
//	public void setdA(String dA) {
//		this.dA = dA;
//	}
//
//	public String getIT() {
//		return IT;
//	}
//
//	public void setIT(String iT) {
//		IT = iT;
//	}
//
//	public String getNetSalary() {
//		return netSalary;
//	}
//
//	public void setNetSalary(String netSalary) {
//		this.netSalary = netSalary;
//	}
//
//	public String getGrossSalary() {
//		return grossSalary;
//	}
//
//	public void setGrossSalary(String grossSalary) {
//		this.grossSalary = grossSalary;
//	}

//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + ", dA=" + dA + ", IT="
//				+ IT + ", netSalary=" + netSalary + " grossSalary=\" + grossSalary + \"]";
//	}
	
//	public double calNetSalary() {
//		Scanner scan= new Scanner(System.in);
//        System.out.println("Enter the employee's basic salary");
//        basicSalary=scanner.nextString();
//        
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the employee's Gross salary");
//        grossSalary=scanner.nextString();
//		
//		//return (52*this.basicSalary)/100;
//		DA=(52/100)*this.basicSalary;
//		IT=(30/100)*this.grossSalary;
//	}

//	public void calculate() {
//		DA=(52*this.basicSalary)/100;
//		IT=(32*this.basicSalary)/100;
//	}
//	


