package org.flightBooking.Services;

public class AvailableFlights {
    public String flightName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String arrivalTime;
    public String departureTime;

    public int flight_id;
    public int sched_id;
    public double price;

    public AvailableFlights(String flightName, String arrivalTime, String departureTime, int flight_id, int sched_id, double price) {
        this.flightName = flightName;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.flight_id = flight_id;
        this.sched_id = sched_id;
        this.price = price;
    }
}
