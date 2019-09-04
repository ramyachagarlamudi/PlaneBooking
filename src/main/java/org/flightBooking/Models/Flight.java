package org.flightBooking.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name="Flight")
public class Flight {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) private int flightId;

    @Column(name="flightName") private String flightName;

    @Column(name="NoOfEconomySeats") private int noOfEconomySeats;

    @Column(name="NoOfBusinessSeats") private int noOfBusinessSeats;

    @Column(name="NoOfFirstClassSeats") private int noOfFirstClassSeats;

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getNoOfEconomySeats() {
        return noOfEconomySeats;
    }

    public void setNoOfEconomySeats(int noOfEconomySeats) {
        this.noOfEconomySeats = noOfEconomySeats;
    }

    public int getNoOfBusinessSeats() {
        return noOfBusinessSeats;
    }

    public void setNoOfBusinessSeats(int noOfBusinessSeats) {
        this.noOfBusinessSeats = noOfBusinessSeats;
    }

    public int getNoOfFirstClassSeats() {
        return noOfFirstClassSeats;
    }

    public void setNoOfFirstClassSeats(int noOfFirstClassSeats) {
        this.noOfFirstClassSeats = noOfFirstClassSeats;
    }

    public Flight() {
    }

    public String getFlightName() {
        return flightName;
    }

    public Flight(int flightId, String flightName, int noOfEconomySeats, int noOfBusinessSeats, int noOfFirstClassSeats) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.noOfEconomySeats = noOfEconomySeats;
        this.noOfBusinessSeats = noOfBusinessSeats;
        this.noOfFirstClassSeats = noOfFirstClassSeats;
    }

    public void setFlightName(String flightName) { this.flightName = flightName; }

}

