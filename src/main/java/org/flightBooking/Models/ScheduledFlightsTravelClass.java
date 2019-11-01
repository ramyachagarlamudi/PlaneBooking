package org.flightBooking.Models;
import javax.persistence.*;

@Entity
@Table(name = "scheduledflighttravelclass")
public class ScheduledFlightsTravelClass {
    @Id
    @JoinColumn
    private int schedflightId;

    @Column(name = "TravelClass")
    private String travelClass;

    @Column(name = "noofseats")
    private int noOfSeats;

    @Column(name = "price")
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getSchedflightId() {

        return schedflightId;
    }

    public void setSchedflightId(int schedflightId) {

        this.schedflightId = schedflightId;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {

        this.travelClass = travelClass;
    }

    public int getNoOfSeats() {

        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public ScheduledFlightsTravelClass(int schedflightId, String travelClass, int noOfSeats, int price) {
        this.schedflightId = schedflightId;
        this.travelClass = travelClass;
        this.noOfSeats = noOfSeats;
        this.price = price;
    }
}