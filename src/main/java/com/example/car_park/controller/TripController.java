package com.example.car_park.controller;

import com.example.car_park.entity.Ticket;
import com.example.car_park.entity.Trip;
import com.example.car_park.exception.NotFoundException;
import com.example.car_park.exception.NotInvalidException;
import com.example.car_park.service.TicketService;
import com.example.car_park.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {

    @Autowired
    TripService tripService;

    @PostMapping("/")
    public Trip create(@RequestBody @Valid Trip trip) throws NotInvalidException {

        return tripService.create(trip);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid int tripId) {
        tripService.delete(tripId);
    }

    @GetMapping("/trips")
    public List<Trip> findAll() {
        return tripService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trip> findByID(@PathVariable @Valid int tripId) {
        Trip trip =tripService.findById(tripId);
        if(trip == null){
            throw new NotFoundException("Không có employee đó trong danh sách");
        }
        return  ResponseEntity.ok(trip);
    }
}
