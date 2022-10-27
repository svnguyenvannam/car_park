package com.example.car_park.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="car")
public class Car {

    @Id
    private String licensePlate;

    @NotNull
    private String carColor;
    @NotNull
    private String carType;
    @NotNull
    private String company;

    @ManyToOne
    @JoinColumn(name = "parkId")
    @NotNull
    @JsonIgnore

    private ParkingLot parkingLot;

    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
    @NotNull
    @JsonIgnore

    private List<Ticket> tickets;

   /* public Car(){};
    *//*public Car(String licensePlate,String carColor,)*/

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carType='" + carType + '\'' +
                ", company='" + company + '\'' +
                ", parkingLot=" + parkingLot +
                ", tickets=" + tickets +
                '}';
    }
}
