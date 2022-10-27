package com.example.car_park.service;

import com.example.car_park.entity.Ticket;
import com.example.car_park.entity.Trip;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TripService {

    Trip create(Trip trip);

    void delete(int tripId);

    Trip findById(int tripId);

    List<Trip> findAll();
}
