package com.techelevator.city;

// This is the DAO concrete class which implements the methods required by the interface

// The name of the class should be JDBCtable-nameDAO

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCCityDAO implements CityDAO { // Implement the interface for the DAO

	// JdbcTemplate class contains all the necessary code to interace with a database using SpringDAOs
	
	private JdbcTemplate jdbcTemplate;		  // Define a reference variable for the a JdbcTemplate object
	
	public JDBCCityDAO(DataSource dataSource) {				// Constructor for the class that takes a datasource as a parameter
		this.jdbcTemplate = new JdbcTemplate(dataSource);	// Instantiace a jdbcTemplate object using the datasource passed
	}													    //		and assign it to the reference defined above.

	// Create/Add a row to the table using the object of the class.
	@Override // Ask the compiler to be sure we are overriding the method required by the DAO interface
	public void save(City newCity) {
		
		// Define a String to hold the SQL statement we want to run

		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) " +
							   "VALUES(?, ?, ?, ?, ?)"; // the ? are placeholders for values specified when the statement is run
														// in this example the values are coming from the object passed to method
														// we don't know the values until run time and this method is called
		newCity.setId(getNextCityId());
		
		// Run the SQL statement to access the database using the JdbcTemplate object
		// Use the .update method because we are executing the INSERT which changed (updates) the database
		// .update() wants the String with the SQL statement to be executed, followed by any values for the ? placeholders
		//				    SQL statement, values-for-the-?'s - one value for each ? in the SQL statement String
		
		jdbcTemplate.update(sqlInsertCity, newCity.getId(),			// value for the first ? in the statement
										  newCity.getName(),		// value for the second ? in the statement
										  newCity.getCountryCode(),	// value for the third ? in the statement
										  newCity.getDistrict(),	// value for the fourth ? in the statement
										  newCity.getPopulation());	// value for the fifth ? in the statement
	}
	
	@Override
	public City findCityById(long id) {
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "+
							   "FROM city "+
							   "WHERE id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if(results.next()) {
			theCity = mapRowToCity(results);
		}
		return theCity;
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		ArrayList<City> cities = new ArrayList<>();
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population "+
										   "FROM city "+
										   "WHERE countrycode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, countryCode);
		while(results.next()) {
			City theCity = mapRowToCity(results);
			cities.add(theCity);
		}
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	private long getNextCityId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

	private City mapRowToCity(SqlRowSet results) {
		City theCity;
		theCity = new City();
		theCity.setId(results.getLong("id"));
		theCity.setName(results.getString("name"));
		theCity.setCountryCode(results.getString("countrycode"));
		theCity.setDistrict(results.getString("district"));
		theCity.setPopulation(results.getInt("population"));
		return theCity;
	}
}
