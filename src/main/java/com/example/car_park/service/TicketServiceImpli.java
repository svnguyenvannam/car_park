package com.example.car_park.service;

import com.example.car_park.entity.Ticket;
import com.example.car_park.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpli implements TicketService{
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket create(Ticket ticket) {

        return ticketRepository.save(ticket);
    }

    @Override
    public void delete(int id) {
        ticketRepository.deleteById(id);
    }
    @Override
    public Ticket findById(int ticketId)
    {
        return ticketRepository.findById(ticketId).orElse(null);
    }
    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

}
