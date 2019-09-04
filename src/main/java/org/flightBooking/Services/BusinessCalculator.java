package org.flightBooking.Services;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BusinessCalculator implements CalculatePrice {

    @Override
    public HashMap<String, int[]> calculatePrice(HashMap<String, int[]> scheduledFlightTravelClass, int passengers, String flyDate) {
        double weekbaseincre = 1;
        try {
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
            SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
            Date tmpflyDate = formatter.parse(flyDate);
            String week = simpleDateformat.format(tmpflyDate);
            if (week.equals("Monday") || week.equals("Friday") || week.equals("Sunday")){
                weekbaseincre = 1.4;
                for(Map.Entry<String, int[]> entry: scheduledFlightTravelClass.entrySet())
                {
                    entry.getValue()[2]= (int) (entry.getValue()[2] * weekbaseincre);
                }
                return scheduledFlightTravelClass;
            }
            else
                return scheduledFlightTravelClass;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return scheduledFlightTravelClass;

    }
}