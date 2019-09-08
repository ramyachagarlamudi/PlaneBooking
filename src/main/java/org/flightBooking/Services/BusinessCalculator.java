package org.flightBooking.Services;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class BusinessCalculator implements CalculatePrice {

    @Override
    public ArrayList<AvailableFlights> calculatePrice(ArrayList<AvailableFlights> scheduledFlightTravelClass, int passengers, String flyDate) {
        try {
            double weekincre=1;
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
            SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
            Date tmpflyDate = formatter.parse(flyDate);
            String week = simpleDateformat.format(tmpflyDate);
            if (week.equals("Monday") || week.equals("Friday") || week.equals("Sunday")) {
                weekincre = 1.4;
            }
                for(AvailableFlights ls: scheduledFlightTravelClass)
                {
                    ls.setPrice(ls.getPrice() * weekincre *passengers);
                }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return scheduledFlightTravelClass;

    }
}