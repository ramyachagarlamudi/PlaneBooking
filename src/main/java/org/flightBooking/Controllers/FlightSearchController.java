package org.flightBooking.Controllers;

import org.flightBooking.Models.AjaxResponseBody;
import org.flightBooking.Services.AvailableFlights;
import org.flightBooking.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FlightSearchController {

    @Autowired
     private Service service;

    @CrossOrigin
    @GetMapping("/search")
    public @ResponseBody
    ArrayList<AvailableFlights> search(@RequestParam(required = true) String source, @RequestParam(required = true) String destination, @RequestParam(required = false, defaultValue = "1") int noOfPassengers, @RequestParam(required = false, defaultValue = "2019-08-21") String flyDate, @RequestParam(required = true) String selectedClass) {
        AjaxResponseBody result = new AjaxResponseBody();
        ResponseEntity.ok("hello");
        return service.searchFlight(source, destination, noOfPassengers, flyDate, selectedClass);
    }
}
