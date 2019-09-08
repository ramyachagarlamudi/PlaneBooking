package org.flightBooking.Services;

import java.util.ArrayList;
import java.util.Map;

public class EconomyCalculator implements CalculatePrice {

    @Override
    public ArrayList<AvailableFlights> calculatePrice(ArrayList<AvailableFlights> scheduledFlightTravelClass, int passengers, String flyDate) {
        double increbase = 1;
        int currentbookingno =1, seatsAvaliableineconomy=1;
        if (currentbookingno <= ((40 * seatsAvaliableineconomy) / 100)) {
            increbase = 1;
        } else if ((currentbookingno <= ((90 * seatsAvaliableineconomy) / 100)) && (currentbookingno >= ((40 * seatsAvaliableineconomy) / 100))) {
            increbase = 1.3;
        } else {
            increbase = 1.6;
        }
        for(AvailableFlights ls: scheduledFlightTravelClass)
        {
            ls.setPrice(ls.getPrice() *increbase *passengers);
        }
        return scheduledFlightTravelClass;
    }
}
