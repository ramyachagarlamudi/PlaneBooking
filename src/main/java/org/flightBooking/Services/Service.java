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

    public ArrayList<AvailableFlights> searchFlight(String source, String destination, int noOfPassengers, String flyDate, String selectedClass) {
        //getting related flights and scheduled flights
        List<ScheduledFlights> scheduledFlightsAll = scheduledFlightsRepository.findBySourceAndDestination(source, destination);
        ArrayList<AvailableFlights> flights = new ArrayList<AvailableFlights>();
        String flight_name; double price;
        if (scheduledFlightsAll.isEmpty()) {
            flights.add(new AvailableFlights("No Flights are avaliable for ","","",0,0,0));
            return flights;
         }
        else {
            for (ScheduledFlights p : scheduledFlightsAll) {
                price = scheFlightsClassRepository.findPriceForAvaliable(p.getSchedflightId(), selectedClass, noOfPassengers);
                flight_name = flightRepository.findFlightName(p.getSchedflightId());
                flights.add(new AvailableFlights(flight_name,p.getArrivalTime(),p.getDepartureTime(),p.getFlightId(), p.getSchedflightId(), price));
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


