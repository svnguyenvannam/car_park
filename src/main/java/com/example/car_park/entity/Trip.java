package com.example.car_park.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "trip")
public class Trip {

    @Id
    private int tripId;
    @NotNull
    private String bookedTickedNumber;
    @NotNull
    private String carType;

    @NotNull
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String departureDate;
    @NotNull
    private String departureTime;
    @NotNull
    private String destination;
    @NotNull
    private String driver;
    @NotNull
    private String maximumOnlineTicketNumber;

    @OneToMany(mappedBy = "trip",cascade = CascadeType.ALL)
    @NotNull
    @JsonIgnore
    private List<Ticket> tickets;
    @OneToMany(mappedBy = "trip",cascade = CascadeType.ALL)
    @NotNull
    @JsonIgnore
    private List<BookingOffice> bookingOffices;

    public List<BookingOffice> getBookingOffices() {
        return bookingOffices;
    }

    public void setBookingOffices(List<BookingOffice> bookingOffices) {
        this.bookingOffices = bookingOffices;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getBookedTickedNumber() {
        return bookedTickedNumber;
    }

    public void setBookedTickedNumber(String bookedTickedNumber) {
        this.bookedTickedNumber = bookedTickedNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getMaximumOnlineTicketNumber() {
        return maximumOnlineTicketNumber;
    }

    public void setMaximumOnlineTicketNumber(String maximumOnlineTicketNumber) {
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripId='" + tripId + '\'' +
                ", bookedTickedNumber='" + bookedTickedNumber + '\'' +
                ", carType='" + carType + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", destination='" + destination + '\'' +
                ", driver='" + driver + '\'' +
                ", maximumOnlineTicketNumber='" + maximumOnlineTicketNumber + '\'' +
                ", tickets=" + tickets +
                ", bookingOffices=" + bookingOffices +
                '}';
    }
}
