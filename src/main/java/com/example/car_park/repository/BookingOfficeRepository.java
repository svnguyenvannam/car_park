package com.example.car_park.repository;

import com.example.car_park.entity.BookingOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingOfficeRepository extends JpaRepository<BookingOffice,Integer> {

    @Query(value = "SELECT * FROM BookingOffice b WHERE b.officePlace = :officePlace and b.officePrice = :officePrice", nativeQuery = true)
    List<BookingOffice> findBookingOfficeByPlaceAndPrice(@Param("officePlace") String officePlace, @Param("officePrice") String officePrice);



}
