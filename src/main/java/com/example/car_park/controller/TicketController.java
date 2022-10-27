package com.example.car_park.controller;

import com.example.car_park.entity.Employee;
import com.example.car_park.entity.Ticket;
import com.example.car_park.exception.NotFoundException;
import com.example.car_park.exception.NotInvalidException;
import com.example.car_park.service.EmployeeService;
import com.example.car_park.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/")
    public Ticket create(@RequestBody @Valid Ticket ticket) throws NotInvalidException {

        return ticketService.create(ticket);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid int ticketId) {
        ticketService.delete(ticketId);
    }

    @GetMapping("/tickets")
    public List<Ticket> findAll() {
        return ticketService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> findByID(@PathVariable @Valid int ticketId) {
        Ticket ticket =ticketService.findById(ticketId);
        if(ticket == null){
            throw new NotFoundException("Không có employee đó trong danh sách");
        }
        return  ResponseEntity.ok(ticket);
    }
}
