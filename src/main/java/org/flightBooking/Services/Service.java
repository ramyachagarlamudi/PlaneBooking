package org.flightBooking.Services;

import org.flightBooking.Models.ScheduledFlights;
import org.flightBooking.Repository.FlightRepository;
import org.flightBooking.Repository.ScheduledFlightsRepository;
import org.flightBooking.Repository.ScheduledTravelClassRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private ScheduledTravelClassRepository scheFlightsClassRepository;

    @Autowired
    private ScheduledFlightsRepository scheduledFlightsRepository;

    public HashMap<String, int[]> searchFlight(String source, String destination, int noOfPassengers, String flyDate, String selectedClass) {
        //getting related flights and scheduled flights
        List<ScheduledFlights> scheduledFlightsAll = scheduledFlightsRepository.findBySourceAndDestination(source, destination);
        HashMap<String, int[]> flights = new HashMap<>();
        int[] schflight_data = new int[3];String flight_name;
        if (scheduledFlightsAll.isEmpty()) {
            schflight_data[0]=schflight_data[1]=schflight_data[2]=0;
            flights.put("No Flights are avaliable for ", schflight_data);
            return flights;
         }
        else {
            for (ScheduledFlights p : scheduledFlightsAll) {
                schflight_data[0] = p.getFlightId();
                schflight_data[1] = p.getSchedflightId();
                schflight_data[2] = scheFlightsClassRepository.findPriceForAvaliable(p.getSchedflightId(), selectedClass, noOfPassengers);
                flight_name = flightRepository.findFlightName(p.getSchedflightId());
                flights.put(flight_name, schflight_data);
            }
            CalculatePrice calculatePrice = null;
            switch (selectedClass) { // switch case for the selected seat class and fare base on the class selected
                case "Economy":  // Calculating the % increase in the economy fare based on the range current booking falls with total available tickets
                    calculatePrice = new EconomyCalculator();
                    break;
                case "BusinessClass": // Calculating the % increase in the Business Class fare based on the week days. More fare for Monday, Firday and Saturday
                    calculatePrice = new BusinessCalculator();
                    break;
                case "FirstClass":  // Calculating the % increase in the First Class fare by compare the departure date with the current booking date
                    calculatePrice = new FirstClassCalculator();
                    break;
            }
            flights = calculatePrice.calculatePrice(flights, noOfPassengers, flyDate);
        }
          return flights;
    }
   }


