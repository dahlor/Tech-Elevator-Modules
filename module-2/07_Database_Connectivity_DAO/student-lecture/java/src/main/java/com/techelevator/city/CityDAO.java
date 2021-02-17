package com.techelevator.city;

// This is the DAO interface for the City table in the world database

// It identifies methods that must be implemented in order to use this DAO
// Typically, CRUD processes are required methods for a Spring DAO
// Other methods may also be required at the DAO designer's discretion

// This DAO interface gives examples of common processing requirements for a Spring DAO

// Note that object of the class are used to insert and update, rather than individual variables

// Not included in this DAO, but common, is a method to return all rows in the table as a List

import java.util.List;

public interface CityDAO {

	public void save(City newCity);		// Add/Create a row to the table using an object of the class
	
	public City findCityById(long id);

// One or more search methods to retrieve data in the table	
	public List<City> findCityByCountryCode(String countryCode);
	public List<City> findCityByDistrict(String district);

	
	public void update(City city);	// Update a row in the table using an object of the class
	public void delete(long id);	// Delete a row from the table using the id passed as a parameter
									//		the parameter is usually the column(s) in the primary
}
