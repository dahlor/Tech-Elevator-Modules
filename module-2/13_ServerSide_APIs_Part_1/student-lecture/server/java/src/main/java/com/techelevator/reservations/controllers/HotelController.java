package com.techelevator.reservations.controllers;

// This will handle API calls sent to server with the paths specified in @RequestMapping
// API handlers == Controllers
//
// Typically controllers find the data the caller needs and returns it
//
// Usually the data is retrieved by the controller using a DAO of some sort
//
// A controller normally does not have a lot of logic - its job is to get data and return it to the caller
//
// Controllers are part of the MVC design pattern to structuring applications
//
// MVC stands for Model-View-Controller
//
//		Model - data for the application
//		View - how the data is displayed to the user / Any user interaction
//		Controller - Coordinated the data transfer between the Model and the View
//
//	In this application:
//
//		Model - handled by DAOs
//		View - handled by the client
//		Controller - receives API requests via API call from the client, find the data based on it and return it


import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController		// This tells the server that are controllers in here to handle specified URL paths
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;
    
    // Constructor for this class of controllers.
    
    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();						// Instantiate an object with HotelDAO methods and assign to reference
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);	// Instantiate an object with ReservationDAO methods and assign to reference
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system when a GET request with the /hotels path is received by the server
     */
    // assign a URL path to a method and HTTP request combination
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
    	System.out.println("Called with the path /hotels");
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET) // handle the path "/hotels/data"
    public Hotel get(@PathVariable int id) {	// @PathVariable says for get the path variable called
    											//		and store it in an int for this method
    	
    	System.out.println("Called with the path /hotels/" + id);	// Display a message with the data passed in the path
        return hotelDAO.get(id);
    }
    
    // Write a controller to return all the reservations when we get the path "/reservations"
    // We will use the ReservationDAO findAll() method to get the reservations
    @RequestMapping(path="/reservations", method=RequestMethod.GET)
    public List<Reservation> anyNameYouWant() {
    	System.out.println("Called with the path /reservations");
    	return reservationDAO.findAll();
    }

    // Write a controller to add a Reservation to the Reservation resource on this server
    //		using path: /hotels/id/reservations		- id is the hotelId for the reservation
    //
    // http://localhost:8080/hotels/1/reservations - should add a reservation for the hotel whose id = 1
    //
    // the data for the new reservation will be in the body of the POST request used to call us 
    //
    // @RequestBody - create an object from the data in the body of the request
    // @PathVariable - get the value from the data in the path
    //
    @RequestMapping(path="hotels/{id}/reservations", method=RequestMethod.POST)
    public Reservation whatEver(@RequestBody Reservation aReservation	// Take the data in the request body and instantiate a Reservation object
    						   ,@PathVariable("id") int hotelId) {		 // Take the id from the path and store it in an int called hotelId
    
    	System.out.println("Called with the path /hotels/"+hotelId+"reservations");
    	
    	return reservationDAO.create(aReservation, hotelId); // Use the create method in the reservationDAO to create a new reservation
    }
}
