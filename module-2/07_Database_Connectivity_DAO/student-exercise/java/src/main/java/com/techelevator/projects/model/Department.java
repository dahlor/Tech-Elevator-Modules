package com.techelevator.projects.model;

public class Department {

	// Declarations.
	private Long departmentId;
	private String departmentName;
	
	// Constructors.
	public Department() {
		departmentId = null;
		departmentName = "";
	}
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Department(Long departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	// Setters and getters.
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
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