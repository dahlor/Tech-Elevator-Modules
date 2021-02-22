package com.techelevator;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;

	@FixMethodOrder(MethodSorters.NAME_ASCENDING) // list the tests in alphabetical order when you run them
	public class TestJDBCProjectsDAO {

/***********************************************************************************
 * Set up for database access
 ***********************************************************************************/

		// Define a reference to a data source to use in the tests
		private static SingleConnectionDataSource dataSource;
		
		// Define a reference to the JDBC/DAO we want to test
		private JDBCProjectDAO projDao;
		
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
			
			// Instantiate an object containing the methods we want to test and assign it to the reference above
			projDao = new JDBCProjectDAO(dataSource);
			
		}
		
		
		@After
		public void testTakeDown() throws SQLException {
			
			dataSource.getConnection().rollback(); // Rollback after every test so data is not permanently stored in the database.
		
		}
			
/**************************************************************************************************
 * Now that all the setup stuff is done, we can start writing test for the methods in the JDBC/DAO
 **************************************************************************************************/
		
		@Test 
		public void getAllActiveProjects() {
			List<Project> results = projDao.getAllActiveProjects();
			assertNotNull(results);
			assertEquals(projDao.getAllActiveProjects().size(), results.size());
		}
		
		@Test
		public void removeEmployeeFromProject() {
			String sqlGetProjectById = "select employee_id from project_employee where project_id = 6";
			JdbcTemplate theDataBase = new JdbcTemplate(dataSource);
			SqlRowSet ProjectBy_id = theDataBase.queryForRowSet(sqlGetProjectById);
			assertNotNull(ProjectBy_id);
			projDao.removeEmployeeFromProject(6L, 5L);
			ProjectBy_id = theDataBase.queryForRowSet(sqlGetProjectById);
			assertNotNull(ProjectBy_id);
		}
		
		@Test
		public void addEmployeeToProject() {
			projDao.addEmployeeToProject(5L, 5L);
			String sqlGetProjectById = "select employee_id from project_employee where project_id = 5";
			JdbcTemplate theDataBase = new JdbcTemplate(dataSource);
			SqlRowSet ProjectBy_id = theDataBase.queryForRowSet(sqlGetProjectById);
			assertNotNull(ProjectBy_id);
		}
}
