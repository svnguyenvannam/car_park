package com.example.car_park.service;

import com.example.car_park.entity.Employee;
import com.example.car_park.entity.ParkingLot;
import com.example.car_park.repository.EmployeeRepository;
import com.example.car_park.repository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingLotServiceImpli implements ParkingLotService{

    @Autowired
    ParkingLotRepository parkingLotRepository;

    @Override
    public ParkingLot create(ParkingLot parkingLot) {

        return parkingLotRepository.save(parkingLot);
    }

    @Override
    public void delete(int parkId) {
        parkingLotRepository.deleteById(parkId);
    }
    @Override
    public ParkingLot findById(int parkId) {

        return parkingLotRepository.findById(parkId).orElse(null);
    }
    @Override
    public List<ParkingLot> findAll() {

        return parkingLotRepository.findAll();
    }

}
