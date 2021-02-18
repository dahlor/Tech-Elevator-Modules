package com.techelevator.projects.model;

import java.util.Date;
import java.time.LocalDate;


public class Employee {
	
		// Declarations.
		private Long employeeId;
		private Long departmentId;
		private String firstName;
		private String lastName;
		private Date birthDate;
		private char gender;
		private Date hireDate;
		
		// Constructors.
		public Employee() {
			employeeId = null;
			departmentId = null;
			firstName = "";
			lastName = "";
			birthDate = null;
			gender = '0';
			hireDate = null;
		}
		
		public Employee(Long employeeId, Long departmentId, String firstName, String lastName, Date birthDate, char gender, Date hireDate) {
			this.employeeId = employeeId;
			this.departmentId = departmentId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthDate = birthDate;
			this.gender = gender;
			this.hireDate = hireDate;
		}
		
		// Setters and getters.
		public Long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}

		public Long getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public Date getHireDate() {
			return hireDate;
		}

		public void setHireDate(Date hireDate) {
			this.hireDate = hireDate;
		}

		// Method(s).
		public String toString() {
			return getLastName() + ", " + getFirstName();
		}
	}