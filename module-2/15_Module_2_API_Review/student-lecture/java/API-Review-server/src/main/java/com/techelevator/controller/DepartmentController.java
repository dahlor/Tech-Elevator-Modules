package com.techelevator.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.Department;
import com.techelevator.model.DepartmentDAO;


/**
 * Controller to handle API requests for the Department resource
 */

@RestController // Tells the server this file contains controllers
public class DepartmentController {
	
	DepartmentDAO deptDAO; // Define a reference to the deptDAO so we can access its methods
	
	// Constructor for this class - public, same name the class
	// Use Spring dependency injection to instantiate a DepartmentDAO object and pass it to ctor
	
	public DepartmentController(DepartmentDAO deptDAO) {	// Receive a DepartmentDAO object as a parameter 
		this.deptDAO = deptDAO;		// assign to our reference the deptDAO passed to the ctor
	}
	
	// This controller will handle the path "/departments"
	// to send back all the Departments
	
	@RequestMapping(path="/departments", method= RequestMethod.GET) // The following function will handle /departments path 
	public List<Department> listAllDepartments() {
		logAPICall("Called with path: /departments");
		// Use the Departments DAO to get all the Departments from the database and return them
		List<Department> theDepartments;
		
		theDepartments = deptDAO.getAllDepartments();
		
		return theDepartments;
	}
	
	// This controller will get a specific department from the Department resource based on it's id.
	// Use the DepartmentDAO getDepartmentById() method
	//
	// The path the API will use to invoke this is: /departments/{id}
	// {id} indicates a value will be included in the path and we want to call it id
	// We use @PathVariable in the method parameter list to retrieve from the path
	// A user will call us to get department #3: /departments/3
	@RequestMapping(path="/departmentd/{deptNum}", method=RequestMethod.GET)
	public Department getDepartmentById(@PathVariable Long deptNum) {
		logAPICall("Called with the path: /departments/"+deptNum);
		return deptDAO.getDepartmentById(deptNum); // Call the DAO method to get the department with the id given and return it
		
	}
	
public void logAPICall(String message) {	// Write a message with a time stamp to the server log
	 LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss.A");
     String timeNow = now.format(formatter);
     System.out.println(timeNow + "-" + message);
 }
}


