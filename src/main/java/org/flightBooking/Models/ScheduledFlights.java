package org.flightBooking.Models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "scheduledflights")
public class ScheduledFlights {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int schedflightId;

    @JoinColumn(unique = true)
    private int flightId;

    @Column(name = "Source")
    private String source;

    @Column(name = "Destination")
    private String destination;

    @Column(name = "DepartureDate")
    private String departureDate;

    @Column(name = "DepartureTime")
    private String departureTime;

    @Column(name = "ArrivalTime")
    private String arrivalTime;

    @Column(name = "TotalAvaliableSeats")
    private int totalAvaliableSeats;

    public int getTotalAvaliableSeats() {
        return totalAvaliableSeats;
    }

    public void setTotalAvaliableSeats(int totalAvaliableSeats) {
        this.totalAvaliableSeats = totalAvaliableSeats;
    }

    public int getSchedflightId() {
        return schedflightId;
    }

    public void setSchedflightId(int schedflightId) {
        this.schedflightId = schedflightId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
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

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public ScheduledFlights(int schedflightId, String source, String destination, String departureDate, String departureTime, String arrivalTime, int totalAvaliableSeats) {
        this.schedflightId = schedflightId;
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.totalAvaliableSeats = totalAvaliableSeats;
    }
}