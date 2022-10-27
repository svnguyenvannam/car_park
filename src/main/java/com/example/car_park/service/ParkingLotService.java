package com.example.car_park.service;

import com.example.car_park.entity.Employee;
import com.example.car_park.entity.ParkingLot;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingLotService {
    ParkingLot create(ParkingLot parkingLot);

    void delete(int parkId);

    ParkingLot findById(int parkId);

    List<ParkingLot> findAll();
}
