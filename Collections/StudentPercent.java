package com.collection.framework.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student{
	int rollno;
	String sname, classname;
	Double totalmarks;

	public Student() {}

	public Student(int rollno, String sname, String classname, Double totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Double getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(Double totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}

	
}

class InsertStudent{
	List<Student> st=new ArrayList<Student>();
	InsertStudent(){
		st.add(new Student(1, "Manoj", "Arts",345.0));
		st.add(new Student(2, "rakre", "Science",298.0));
		st.add(new Student(3, "ujjain", "Commerce",428.0));
		st.add(new Student(4, "sujain", "MCVC",459.0));
		st.add(new Student(5, "ranjan", "IT",360.0));
		
	}
	
public  void total() {
	int total = 0;
    double  percentage ;
		for(int i=0; i<st.size();i++) {
			total +=(st.get(i).getTotalmarks());	
			}
		for(int j = 0; j < st.size(); j++){
			percentage = Math.round(100.0 * 
	                (st.get(j).getTotalmarks()) / 500);
		System.out.println(percentage);
		}
		
		}

     
    	   
       }
		
public class StudentPercent {
	public static void main(String[] args) {
		
		InsertStudent s1 = new InsertStudent();
		s1.total();
		
	}
	
}

