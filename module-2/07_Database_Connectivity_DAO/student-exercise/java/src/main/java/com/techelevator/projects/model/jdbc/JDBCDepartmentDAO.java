package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Department> getAllDepartments() {
		
		List<Department> listOfDepartments = new ArrayList<Department>();
		
		String getAllDepartmentsSQL = "select department_id, name from department order by name";
		
		SqlRowSet theDepartments = jdbcTemplate.queryForRowSet(getAllDepartmentsSQL); // since there are no placeholders in the SQL, nothing else is coded
		
		while(theDepartments.next()) {
			Department aDepartment = MapRowToDepartment(theDepartments);	// Note MapRowToDepartment needs to be written
			listOfDepartments.add(aDepartment);
			}
	
		return listOfDepartments;
	}
	
	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		
		List<Department> resultsOfDepartmentSearch = new ArrayList<Department>();
		
		String searchAllDepartmentsSQL = ("select * from department where upper(name) like upper('%" + nameSearch + "%') order by name");
		
		SqlRowSet theDepartments = jdbcTemplate.queryForRowSet(searchAllDepartmentsSQL); // since there are no placeholders in the SQL, nothing else is coded
		
		while(theDepartments.next()) {
			Department aDepartment = MapRowToDepartment(theDepartments);	// Note MapRowToDepartment needs to be written
			resultsOfDepartmentSearch.add(aDepartment);
			}
	
		return resultsOfDepartmentSearch;
	}
	
	@Override
	public void saveDepartment(Department updatedDepartment) {
		
		jdbcTemplate.update("update department"
							+ " set name = '" + updatedDepartment + "'"
							+ " where department_id = " + updatedDepartment.getDepartmentId());
	}
	
	@Override
	public Department createDepartment(Department newDepartment) {

		jdbcTemplate.update("insert into department (name)"
						   + "values('" + newDepartment + "')");
		
		String retrieveNewDepartmentInfo = ("select department_id, name from department where name = '" + newDepartment + "'");
		
		SqlRowSet soManyNewDepartments = jdbcTemplate.queryForRowSet(retrieveNewDepartmentInfo);
				
		Department reallyNewDepartment;
		reallyNewDepartment = new Department();
		
		while(soManyNewDepartments.next()) {
			reallyNewDepartment.setDepartmentId(soManyNewDepartments.getLong("department_id"));
			reallyNewDepartment.setDepartmentName(soManyNewDepartments.getString("name"));
		}
		
		return reallyNewDepartment;
	}
	
	@Override
	public Department getDepartmentById(Long id) {

		String retrieveDepartmentById = ("select department_id, name from department where department_id = " + id);

		SqlRowSet soVeryManyNewDepartments = jdbcTemplate.queryForRowSet(retrieveDepartmentById);
		
		Department superDuperNewDepartment;
		superDuperNewDepartment = new Department();

		while(soVeryManyNewDepartments.next()) {
			superDuperNewDepartment.setDepartmentId(soVeryManyNewDepartments.getLong("department_id"));
			superDuperNewDepartment.setDepartmentName(soVeryManyNewDepartments.getString("name"));
		}

		return superDuperNewDepartment;
	}
		
	public Department MapRowToDepartment(SqlRowSet theRows) {
		
		Department oneDepartment;
		oneDepartment = new Department();
		oneDepartment.setDepartmentId(theRows.getLong("department_id"));
		oneDepartment.setDepartmentName(theRows.getString("name"));
		
		return oneDepartment;
	}
}