package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		String getAllEmployeesSQL = "select last_name, first_name, employee_id from employee order by last_name";
		
		SqlRowSet theEmployees = jdbcTemplate.queryForRowSet(getAllEmployeesSQL);
		
		while(theEmployees.next()) {
			Employee anEmployee = MapRowToEmployee(theEmployees);
			listOfEmployees.add(anEmployee);
			}
	
		return listOfEmployees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		
		List<Employee> resultsOfEmployeeSearch = new ArrayList<Employee>();
		String firstNameAdapted;
		String lastNameAdapted;
		
		if (firstNameSearch.equals("")) {
			firstNameAdapted =  ""; 
		} else {
			firstNameAdapted = ("%"+firstNameSearch+"%");
		}
				
		if (lastNameSearch.equals("")) {
			lastNameAdapted = ""; 
		} else {
			lastNameAdapted = ("%"+lastNameSearch+"%");
		}
					
		String searchAllEmployeesSQL = ("select last_name, first_name, employee_id from employee where upper(first_name) like upper('"+firstNameAdapted+"') or upper(last_name) like upper('"+lastNameAdapted+"') order by last_name");
		
		SqlRowSet theEmployees = jdbcTemplate.queryForRowSet(searchAllEmployeesSQL);
		
		while(theEmployees.next()) {
			Employee anEmployee = MapRowToEmployee(theEmployees);
			resultsOfEmployeeSearch.add(anEmployee);
			}
	
		return resultsOfEmployeeSearch;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		String getAllEmployeesSQL = ("select last_name, first_name, employee_id from employee where department_id = " + id + " order by last_name");
		
		SqlRowSet theEmployees = jdbcTemplate.queryForRowSet(getAllEmployeesSQL); 
		
		while(theEmployees.next()) {
			Employee anEmployee = MapRowToEmployee(theEmployees);
			listOfEmployees.add(anEmployee);
			}
	
		return listOfEmployees;
	}
	
	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		String getAllEmployeesSQL = ("select last_name, first_name, employee_id from employee where not exists (select employee_id from project_employee where employee.employee_id = project_employee.employee_id)");
		
		SqlRowSet theEmployees = jdbcTemplate.queryForRowSet(getAllEmployeesSQL);
		
		while(theEmployees.next()) {
			Employee anEmployee = MapRowToEmployee(theEmployees);
			listOfEmployees.add(anEmployee);
			}
	
		return listOfEmployees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {

		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		String getAllEmployeesSQL = ("select last_name, first_name, employee.employee_id from employee inner join project_employee on employee.employee_id = project_employee.employee_id where project_id = " + projectId + " order by last_name, first_name, employee.employee_id");
		
		SqlRowSet theEmployees = jdbcTemplate.queryForRowSet(getAllEmployeesSQL);
		
		while(theEmployees.next()) {
			Employee anEmployee = MapRowToEmployee(theEmployees);
			listOfEmployees.add(anEmployee);
			}
	
		return listOfEmployees;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
				
		jdbcTemplate.update("update employee set department_id = " + departmentId + " where employee_id = " + employeeId);		
	}

	public Employee MapRowToEmployee(SqlRowSet theRows) {
		
		Employee oneEmployee;
		oneEmployee = new Employee();
		oneEmployee.setLastName(theRows.getString("last_name"));
		oneEmployee.setFirstName(theRows.getString("first_name"));
		oneEmployee.setEmployeeId(theRows.getLong("employee_id"));
		
		return oneEmployee;
	}
}