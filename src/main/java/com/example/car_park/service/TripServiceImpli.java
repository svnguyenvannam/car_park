package com.example.car_park.service;

import com.example.car_park.entity.Ticket;
import com.example.car_park.entity.Trip;
import com.example.car_park.repository.TicketRepository;
import com.example.car_park.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpli implements TripService{

    @Autowired
    TripRepository tripRepository;

    @Override
    public Trip create(Trip trip) {

        return tripRepository.save(trip);
    }

    @Override
    public void delete(int tripId) {
        tripRepository.deleteById(tripId);
    }
    @Override
    public Trip findById(int tripId)
    {
        return tripRepository.findById(tripId).orElse(null);
    }
    @Override
    public List<Trip> findAll() {
        return tripRepository.findAll();
    }

}
