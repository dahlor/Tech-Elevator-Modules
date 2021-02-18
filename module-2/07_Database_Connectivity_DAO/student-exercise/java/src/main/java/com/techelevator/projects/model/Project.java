package com.techelevator.projects.model;

import java.util.Date;

public class Project {
	
	// Declarations.
	private Long projectId;
	private String projectName;
	private Date fromDate;
	private Date toDate;
	
	// Constructors.
	public Project() {
		projectId = null;
		projectName = "";
		fromDate = null;
		toDate = null;
	}
	
	public Project(Long projectId, String projectName, Date fromDate, Date toDate) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	
	// Setters and getters.
	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	// Method(s).
	public String toString() {
		return getProjectName();
	}
}