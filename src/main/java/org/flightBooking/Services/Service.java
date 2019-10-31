package org.flightBooking.Services;

import org.flightBooking.Models.Passenger;
import org.flightBooking.Models.Reservations;
import org.flightBooking.Models.ScheduledFlights;
import org.flightBooking.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private ScheduledTravelClassRepository scheFlightsClassRepository;

    @Autowired
    private ScheduledFlightsRepository scheduledFlightsRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public AvailableFlights selectedFlight(int sched_id, String flightName, String selectedClass, double price, int passenger) {
        ScheduledFlights selected = scheduledFlightsRepository.findById(sched_id).get();
        return (new AvailableFlights(flightName, selected.getArrivalTime(), selected.getDepartureTime(), selected.getDepartureDate(), selected.getSource(), selected.getDestination(), selected.getFlightId(), selected.getSchedflightId(), price, selectedClass, passenger));
    }

    public ArrayList<AvailableFlights> searchFlight(String source, String destination, int noOfPassengers, String flyDate, String selectedClass) {
        //getting related flights and scheduled flights
        List<ScheduledFlights> scheduledFlightsAll = scheduledFlightsRepository.findBySourceAndDestination(source, destination);
        ArrayList<AvailableFlights> flights = new ArrayList<AvailableFlights>();
        String flight_name;
        double price;
        if (scheduledFlightsAll.isEmpty()) {
            flights.add(new AvailableFlights("No Flights are avaliable for ", "", "", "", "", "", 0, 0, 0, "", 0));
            return flights;
        } else {
            for (ScheduledFlights p : scheduledFlightsAll) {
                price = scheFlightsClassRepository.findPriceForAvaliable(p.getSchedflightId(), selectedClass, noOfPassengers);
                flight_name = flightRepository.findFlightName(p.getSchedflightId());
                flights.add(new AvailableFlights(flight_name, p.getArrivalTime(), p.getDepartureTime(), p.getDepartureDate(), p.getSource(), p.getDestination(), p.getFlightId(), p.getSchedflightId(), price, selectedClass, noOfPassengers));
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


    public void addBooking(Object fullName, Object email, Object mobileNumber, Object address) {
        if (getPassengerId(fullName.toString(), email.toString()) == null) {
            passengerRepository.insertPassenger(fullName.toString(), email.toString(), mobileNumber.toString(), address.toString());
        }
    }


    public void addReservation(int passengerId, int sched_id, String fullName, String flightName, String source, String destination, String departureTime, String arrivalTime, String departureDate, double price, String selectedClass) {
        reservationRepository.insertReservation(passengerId, sched_id, fullName, flightName, source, destination, departureTime, arrivalTime, departureDate, selectedClass, price);

    }

    public int getReservationId(int passengerId, String fullName) {
        int reservation = reservationRepository.findReservationId(passengerId, fullName);
        return reservation;
    }

    public Passenger getPassengerId(Object fullName, Object email) {
        Passenger passenger = passengerRepository.getPassenger(fullName.toString(), email.toString());
        return passenger;
    }

    public Reservations getReservation(int reservationId) {
        Reservations reservation;
        try {
            reservation = (reservationRepository.findById(reservationId)).get();
            return reservation;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }

}


