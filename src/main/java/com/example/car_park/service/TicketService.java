package com.example.car_park.service;

import com.example.car_park.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {
    Ticket create(Ticket ticket);

    void delete(int ticketId);

    Ticket findById(int ticketId);

    List<Ticket> findAll();
}
