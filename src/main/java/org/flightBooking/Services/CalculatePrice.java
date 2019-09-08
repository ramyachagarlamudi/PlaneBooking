package org.flightBooking.Services;

import java.util.ArrayList;
import java.util.HashMap;

public interface CalculatePrice {
    ArrayList<AvailableFlights> calculatePrice(ArrayList<AvailableFlights> scheduledFlightTravelClass, int passengers, String flyDate);
}
