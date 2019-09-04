package org.flightBooking.Services;

import java.util.HashMap;
import java.util.Map;

public class EconomyCalculator implements CalculatePrice {

    @Override
    public HashMap<String, int[]> calculatePrice(HashMap<String, int[]> scheduledFlightTravelClass, int passengers, String flyDate) {
        double increbase = 1;
        int currentbookingno =1, seatsAvaliableineconomy=1;


        if (currentbookingno <= ((40 * seatsAvaliableineconomy) / 100)) {
            increbase = 1;
        } else if ((currentbookingno <= ((90 * seatsAvaliableineconomy) / 100)) && (currentbookingno >= ((40 * seatsAvaliableineconomy) / 100))) {
            increbase = 1.3;
        } else {
            increbase = 1.6;
        }
        for(Map.Entry<String, int[]> entry: scheduledFlightTravelClass.entrySet())
        {
            entry.getValue()[2]= (int) (entry.getValue()[2] * increbase);
        }
        return scheduledFlightTravelClass;
    }
}
