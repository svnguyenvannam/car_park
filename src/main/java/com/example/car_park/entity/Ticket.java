package com.example.car_park.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    private int ticketId;
    @NotNull
    private String bookingTime;
    @NotNull
    private String customerName;
    @ManyToOne
    @JoinColumn(name = "licensePlate")
    @NotNull
    @JsonIgnore
    private Car car;

    @ManyToOne
    @JoinColumn(name = "tripId")
    private Trip trip;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", bookingTime='" + bookingTime + '\'' +
                ", customerName='" + customerName + '\'' +
                ", car=" + car +
                ", trip=" + trip +
                '}';
    }
}
