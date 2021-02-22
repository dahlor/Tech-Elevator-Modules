package com.techelevator;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class TestJDBCEmployeeDAO {
	
	/***********************************************************************************
	 * Set up for database access
	 ***********************************************************************************/

			// Define a reference to a data source to use in the tests
			private static SingleConnectionDataSource dataSource;
			
			// Defining our test person
			private String test_first_name = "Jeff";
			private String test_last_name = "Winger";
			private LocalDate test_birth_date = LocalDate.of(2020, 01, 01);
			private char test_gender = 'M';
			private LocalDate test_hire_date = LocalDate.of(2020, 02, 01);
			private Long test_department_id = 1L;
			private Long employee_id = 14L;
			
			// Define a reference to the JDBC/DAO we want to test
			private JDBCEmployeeDAO empDao;
			
			/* Before any tests are run, this method initializes the datasource for testing */
			@BeforeClass
			public static void setupDataSource() {
				dataSource = new SingleConnectionDataSource();
				dataSource.setUrl("jdbc:postgresql://localhost:5432/projectsDAO");
				dataSource.setUsername("postgres");
				dataSource.setPassword("postgres1");
				/* The following line disables autocommit for connections
				 * returned by this DataSource. This allows us to rollback
				 * any changes after each test */
				dataSource.setAutoCommit(false);
			}
			
			/* After all tests have finished running, this method will close the DataSource */
			@AfterClass
			public static void closeDataSource() throws SQLException {
				dataSource.destroy();
			}
			
	/************************************************************************************
	 * Set up anything we need to do before and after every test
	 ***********************************************************************************/
			
			@Before
			public void testSetup() {
				
				// Put our dude Jeff Winger into the database.
				String sqlInsertEmployee = "insert into employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date) values (14, 1, 'Jeff', 'Winger', '2020, 01, 01', 'M', '2020, 02, 01')";
				JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
				jdbcTemplate.update(sqlInsertEmployee);
				
				// Instantiate an object containing the methods we want to test and assign it to the reference above
				empDao = new JDBCEmployeeDAO(dataSource);				
			}
			
			
			@After
			public void testTakeDown() throws SQLException {
				
				dataSource.getConnection().rollback(); // Rollback after every test so data is not permanently stored in the database.
			
			}
				
	/**************************************************************************************************
	 * Now that all the setup stuff is done, we can start writing test for the methods in the JDBC/DAO
	 **************************************************************************************************/
			
			@Test
			public void test_search_Employee_By_Name() {
				Employee anEmployee = new Employee();
				anEmployee.setFirstName(test_first_name);
				anEmployee.setLastName(test_last_name);
				anEmployee.setBirthDate(java.sql.Date.valueOf(test_birth_date));
				anEmployee.setGender(test_gender);
				anEmployee.setHireDate(java.sql.Date.valueOf(test_hire_date));
				anEmployee.setDepartmentId(test_department_id);
				
				List<Employee> results = empDao.searchEmployeesByName(anEmployee.getFirstName(), anEmployee.getLastName());
				
				assertNotNull(results);
				assertEquals(1, results.size());
				assertEquals(results.get(0).getFirstName(), anEmployee.getFirstName());
				assertEquals(results.get(0).getLastName(), anEmployee.getLastName());
			}
			
			@Test
			public void changeEmployeeDepartment() {
				empDao.changeEmployeeDepartment(4L, 4L);
				List<Employee> result = empDao.searchEmployeesByName("Delora", "Coty");
				Long myLong = 4L;
				assertEquals(myLong, result.get(0).getDepartmentId());
			}

			@Test
			public void getEmployeesWithoutProjects() {
				empDao.getEmployeesWithoutProjects();
				List<Employee> result = empDao.getEmployeesWithoutProjects();
				assertEquals(2, (result.size() - 1));
			}
			
			@Test
			public void getAllEmployees() {
				List<Employee> results = empDao.getAllEmployees();
				assertNotNull(results);
				assertEquals(empDao.getAllEmployees().size(), results.size());
			}
			
			@Test
			public void getEmployeesByProjectId() {
				List<Employee> results = empDao.getEmployeesByProjectId(4L);
				assertNotNull(results);
				assertEquals(empDao.getEmployeesByProjectId(4L).size(), results.size());
			}
	}