package com.techelevator;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private static double annualSalary;
	
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return (lastName + ", " + firstName);
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	// Creating my constructor
	
	// Ctor - 2-arg Constructor
	public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
	this.employeeId = employeeId;  // Set the data member to the parameter
	this.firstName = firstName;  // Set the data member to the parameter
	this.lastName = lastName;  // Set the data member to the parameter
	this.annualSalary = annualSalary;  // Set the data member to the parameter
	}
	
	public static void raiseSalary(double percent) {
		if (percent > 0.0) {
		double reducedPercent = (percent * .01);
		annualSalary = annualSalary * (1.0 + reducedPercent);
	}
	
	}
}
