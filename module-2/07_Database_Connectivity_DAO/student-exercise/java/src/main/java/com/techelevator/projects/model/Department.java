package com.techelevator.projects.model;

public class Department {

	// Declarations.
	private int departmentId;
	private String departmentName;
	
	// Constructors.
	public Department() {
		departmentId = 0;
		departmentName = "";
	}
	
	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	
	// Setters and getters.
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	// Method(s).
	public String toString() {
		return getDepartmentName();
	}
}