package com.example.car_park.controller;

import com.example.car_park.entity.ParkingLot;
import com.example.car_park.exception.NotFoundException;
import com.example.car_park.exception.NotInvalidException;
import com.example.car_park.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/parkingLot")
public class ParkingLotController {
    @Autowired
    ParkingLotService parkingLotService;

    @PostMapping("/")
    public ParkingLot create(@RequestBody @Valid ParkingLot parkingLot) throws NotInvalidException {
        return parkingLotService.create(parkingLot);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid int parkId) {
        parkingLotService.delete(parkId);
    }

    @GetMapping("/parkingLots")
    public List<ParkingLot> findAll() {
        return parkingLotService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingLot> findByID(@PathVariable @Valid int parkId) {
        ParkingLot parkingLot =parkingLotService.findById(parkId);
        if(parkingLot == null){
            throw new NotFoundException("Không có employee đó trong danh sách");
        }
        return  ResponseEntity.ok(parkingLot);
    }}
