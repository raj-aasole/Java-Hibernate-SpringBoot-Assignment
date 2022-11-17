package com.objectclass.assignment;

public class Patient {
	
	private String patientName;
	private Double height;
	private Double weight;
	
	
	public Patient() {
		super();
	}
	public Patient(String patientName, Double height, Double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public Double computeBMI() {
		return this.weight/(this.height*this.height);
	}

}
