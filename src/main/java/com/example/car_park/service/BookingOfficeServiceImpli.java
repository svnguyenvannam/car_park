package com.example.car_park.service;

import com.example.car_park.entity.BookingOffice;
import com.example.car_park.entity.Employee;
import com.example.car_park.repository.BookingOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingOfficeServiceImpli implements BookingOfficeService{

    @Autowired
    BookingOfficeRepository bookingOfficeRepository;

    @Override
    public BookingOffice create(BookingOffice bookingOffice) {

        return bookingOfficeRepository.save(bookingOffice);
    }

    @Override
    public void delete(int officeId)
    {
        bookingOfficeRepository.deleteById(officeId);
    }
    @Override
    public BookingOffice findById(int officeId) {

        return bookingOfficeRepository.findById(officeId).orElse(null);
    }
    @Override
    public List<BookingOffice> findAll() {
        return bookingOfficeRepository.findAll();
    }

    public List<BookingOffice> findBookingOfficeByPlaceAndPrice(String officePlace, String officePrice){
        return bookingOfficeRepository.findBookingOfficeByPlaceAndPrice(officePlace,officePrice);
    }

}
