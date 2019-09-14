package org.flightBooking.Models;

import javax.persistence.*;

@Entity
@Table(name="Passenger")
public class Passenger {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int passengerId;

    @Column
    private String fullName;

    @Column
    private String email;

    @Column
    private String mobileNumber;

    @Column
    private String address;

    public Passenger(int passengerId ,String fullName, String email, String mobileNumber, String address) {
        this.passengerId =passengerId;
        this.fullName = fullName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }
    public Passenger() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
