package com.objectclass.assignment;

public class PatientMaster {
	
	public static void main(String[] args) {
		
		Patient p1 = new Patient("Ishwari",1.3, 60.23);
		System.out.println(p1);
		
		System.out.println("ComputeBMI of patient named " +p1.getPatientName()+ " " +"is:" +p1.computeBMI());
	}
}
