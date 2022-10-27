package com.example.car_park.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table
public class BookingOffice {
    @Id
    private int officeId;
    @NotNull
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String endContractDeadline;
    @NotNull
    private String officeName;
    @NotNull
    @Pattern(regexp = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$")
    private String officePhone;
    @NotNull
    private String officePlace;
    @NotNull
    private String officePrice;
    @NotNull
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String startContractDeadline;
    @ManyToOne
    @JoinColumn(name = "trip_id")
    @NotNull
    @JsonIgnore
    private Trip trip;


    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getEndContractDeadline() {
        return endContractDeadline;
    }

    public void setEndContractDeadline(String endContractDeadline) {
        this.endContractDeadline = endContractDeadline;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficePlace() {
        return officePlace;
    }

    public void setOfficePlace(String officePlace) {
        this.officePlace = officePlace;
    }

    public String getOfficePrice() {
        return officePrice;
    }

    public void setOfficePrice(String officePrice) {
        this.officePrice = officePrice;
    }

    public String getStartContractDeadline() {
        return startContractDeadline;
    }

    public void setStartContractDeadline(String startContractDeadline) {
        this.startContractDeadline = startContractDeadline;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "BookingOffice{" +
                "officeId=" + officeId +
                ", endContractDeadline='" + endContractDeadline + '\'' +
                ", officeName='" + officeName + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", officePlace='" + officePlace + '\'' +
                ", officePrice='" + officePrice + '\'' +
                ", startContractDeadline='" + startContractDeadline + '\'' +
                ", trip=" + trip +
                '}';
    }
}
