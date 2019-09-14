package org.flightBooking.Models;
import javax.persistence.*;

@Entity
@Table(name="reservation")
public class Reservations {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int reservationCode;

    @Column  private int passengerId;

    @Column
    private int schedId;
    @Column
    private int price;
    @Column
    private String fullName;

    @Column(name = "flightName")
    private String flightName;

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

    @Column(name = "SelectedClass")
    private String selectedClass;

    public int getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(int reservationCode) {
        this.reservationCode = reservationCode;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
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

    public String getSelectedClass() {
        return selectedClass;
    }

    public void setSelectedClass(String selectedClass) {
        this.selectedClass = selectedClass;
    }
}
