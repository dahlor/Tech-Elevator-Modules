package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		
		List<Project> listOfProjects = new ArrayList<Project>();
		
		// Define SQL SELECT string.
		String getAllProjectsSQL = ("select project_id, name from project where (from_date <= current_date or from_date isnull) and (to_date >= current_date or to_date isnull) order by name");
		
		SqlRowSet theProjects = jdbcTemplate.queryForRowSet(getAllProjectsSQL); // since there are no placeholders in the SQL, nothing else is coded
		
		while(theProjects.next()) {
			Project aProject = MapRowToProjects(theProjects);	// Note MapRowToDepartment needs to be written
			listOfProjects.add(aProject);
			}
	
		return listOfProjects;
	}
	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		
		jdbcTemplate.update("delete from project_employee where employee_id = " + employeeId + " and project_id = " + projectId);		
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		
		jdbcTemplate.update("insert into project_employee (project_id, employee_id) values ("+projectId+", "+employeeId+")");		

	}
	
	public Project MapRowToProjects(SqlRowSet theRows) {
		
		Project oneProject;
		oneProject = new Project();
		oneProject.setProjectId(theRows.getLong("project_id"));
		oneProject.setProjectName(theRows.getString("name"));
		
		return oneProject;
	}
}