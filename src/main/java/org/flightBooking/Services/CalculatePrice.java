package org.flightBooking.Services;

import java.util.HashMap;

public interface CalculatePrice {
    HashMap<String, int[]> calculatePrice(HashMap<String, int[]> scheduledFlightTravelClass, int passengers, String flyDate);
}
