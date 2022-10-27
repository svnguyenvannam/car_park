package com.example.car_park.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table
public class ParkingLot {
    @Id
    private int parkId;
    @NotNull
    private String parkArea;
    @NotNull
    private String parkName;
    @NotNull
    private String parkPlace;
    @NotNull
    private String parkPrice;
    @NotNull
    private String parkStatus;
    @OneToMany(mappedBy = "parkingLot",cascade = CascadeType.ALL)
    @NotNull
    @JsonIgnore
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }

    public String getParkArea() {
        return parkArea;
    }

    public void setParkArea(String parkArea) {
        this.parkArea = parkArea;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkPlace() {
        return parkPlace;
    }

    public void setParkPlace(String parkPlace) {
        this.parkPlace = parkPlace;
    }

    public String getParkPrice() {
        return parkPrice;
    }

    public void setParkPrice(String parkPrice) {
        this.parkPrice = parkPrice;
    }

    public String getParkStatus() {
        return parkStatus;
    }

    public void setParkStatus(String parkStatus) {
        this.parkStatus = parkStatus;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkId='" + parkId + '\'' +
                ", parkArea='" + parkArea + '\'' +
                ", parkName='" + parkName + '\'' +
                ", parkPlace='" + parkPlace + '\'' +
                ", parkPrice='" + parkPrice + '\'' +
                ", parkStatus='" + parkStatus + '\'' +
                ", cars=" + cars +
                '}';
    }
}
