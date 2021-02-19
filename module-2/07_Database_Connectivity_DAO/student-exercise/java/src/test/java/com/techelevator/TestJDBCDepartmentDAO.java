package com.techelevator;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;

	@FixMethodOrder(MethodSorters.NAME_ASCENDING) // list the tests in alphabetical order when you run them
	public class TestJDBCDepartmentDAO {

/***********************************************************************************
 * Set up for database access
 ***********************************************************************************/

		// Define a reference to a data source to use in the tests
		private static SingleConnectionDataSource dataSource;
		
		// Define a reference to the JDBC/DAO we want to test
		private JDBCDepartmentDAO deptDao;
		
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
			
			// Instantiate a new JdbcTemplate object for use in the tests
			JdbcTemplate theDataBase = new JdbcTemplate(dataSource);
			
			// Instantiate an object containing the methods we cant to test and assign it to the reference above
			deptDao = new JDBCDepartmentDAO(dataSource);
			
		}
		
		
		@After
		public void testTakeDown() throws SQLException {
			
			dataSource.getConnection().rollback(); // Rollback after every test so data is not permanently stored in the database.
		
		}
			
/**************************************************************************************************
 * Now that all the setup stuff is done, we can start writing test for the methods in the JDBC/DAO
 **************************************************************************************************/
		
		// Test the createDepartment() method.
		/**
		 * Inserts a new department into the data store.
		 * 
		 * @param newDepartment the department object to insert
		 * @return the department object with its new id filled in
		 * 
		 */
		
		@Test
		public void testCreateDepartment() {
			
			// Arrange - set up data for the test
			// Create a new department to add to the database
			Department newDept = new Department(); // Instantiate an empty new department.
			newDept.setDepartmentName("Jasons Meatballs"); // Use setters to assign value in the new department.
															// We do not set the value for the primary key
															//		Because the database manager does it.

			Department returnedDept;						// Hold the department returned from the method.

			
			// Act - actually run the method
			returnedDept = deptDao.createDepartment(newDept);	// Call the method to test with the parameters it needs
			
			// Assert - verify the method did what it was supposed to
			
			
			// Check to see if a Department object was returned - if it was, the data was probably added to the database.
			assertNotNull(returnedDept);	//true if the reference is not null - if object was returned, it not null			
		
			// Was the new Department stored correctly
			assertEquals(newDept.getDepartmentName(), returnedDept.getDepartmentName());	// If the department we sent to the database matches the department returned
		}
		
}
