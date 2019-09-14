package org.flightBooking.Services;

public class AvailableFlights {
    public String flightName;
    public String arrivalTime;
    public String departureTime;
    public String departureDate;
    public String source;
    public String destination;
    public int flight_id;
    public int sched_id;
    public double price;
    public String selectedClass;

    public AvailableFlights(String flightName, String arrivalTime, String departureTime, String departureDate, String source, String destination, int flight_id, int sched_id, double price, String selectedClass, int passenger) {
        this.flightName = flightName;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.departureDate = departureDate;
        this.source = source;
        this.destination = destination;
        this.flight_id = flight_id;
        this.sched_id = sched_id;
        this.price = price;
        this.selectedClass = selectedClass;
        this.passenger = passenger;
    }

    public int passenger;

    public String getSelectedClass() {
        return selectedClass;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
    public void setSelectedClass(String selectedClass) {
        this.selectedClass = selectedClass;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public int getSched_id() {
        return sched_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public void setSched_id(int sched_id) {
        this.sched_id = sched_id;
    }
}
