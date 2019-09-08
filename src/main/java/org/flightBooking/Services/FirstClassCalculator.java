package org.flightBooking.Services;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class FirstClassCalculator implements CalculatePrice {

    @Override
    public ArrayList<AvailableFlights> calculatePrice(ArrayList<AvailableFlights> scheduledFlightTravelClass, int passengers, String flyDate) {
        Date nowdate = new Date();
        double firstincrebase = 1;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
            Date tmpflyDate = formatter.parse(flyDate);
            if (tmpflyDate.compareTo(new Date()) < 1) {
                firstincrebase = firstincrebase + 1;
            } else {
                double datedifference = ((tmpflyDate.getTime() - nowdate.getTime()) / (24 * 60 * 60 * 1000)) + 1;
                if (datedifference >= 1 && datedifference < 10)
                    firstincrebase = firstincrebase + ((10 - datedifference) / 10);
            }
            for(AvailableFlights ls: scheduledFlightTravelClass)
            {
                ls.setPrice(ls.getPrice() *firstincrebase *passengers);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return scheduledFlightTravelClass;
    }
}

