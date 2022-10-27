package com.example.car_park.controller;

import com.example.car_park.entity.BookingOffice;
import com.example.car_park.exception.NotFoundException;
import com.example.car_park.exception.NotInvalidException;
import com.example.car_park.service.BookingOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bookingOffice")
public class BookingOfficeController {
    @Autowired
    BookingOfficeService bookingOfficeService;

    @PostMapping("/")
    public BookingOffice create(@RequestBody @Valid BookingOffice bookingOffice) throws NotInvalidException {

        return bookingOfficeService.create(bookingOffice);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid int id) {
        bookingOfficeService.delete(id);
    }

    @GetMapping("/bookingOffices")
    public List<BookingOffice> findAll() {
        return bookingOfficeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingOffice> findByID(@PathVariable @Valid int id) {
        BookingOffice bookingOffice =bookingOfficeService.findById(id);
        if(bookingOffice == null){
            throw new NotFoundException("Không có BookingOffice đó trong danh sách");
        }
        return  ResponseEntity.ok(bookingOffice);
    }
    @GetMapping("/{officePlace}/{officePrice}")

    public List<BookingOffice> findBookingOfficeByPlaceAndPrice(@RequestParam(value = "officePlace") String officePlace, @RequestParam(value = "officePrice") String officePrice){

        return bookingOfficeService.findBookingOfficeByPlaceAndPrice(officePlace,officePrice);

    }



}
