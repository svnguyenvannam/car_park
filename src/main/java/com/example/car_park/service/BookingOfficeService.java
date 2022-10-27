package com.example.car_park.service;

import com.example.car_park.entity.BookingOffice;
import com.example.car_park.entity.Employee;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookingOfficeService {

    BookingOffice create(BookingOffice bookingOffice);

    void delete(int officeId);

    BookingOffice findById(int officeId);

    List<BookingOffice> findAll();

    List<BookingOffice> findBookingOfficeByPlaceAndPrice(@Param("officePlace") String officePlace, @Param("officePrice") String officePrice);
}
