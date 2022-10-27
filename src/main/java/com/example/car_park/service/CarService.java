package com.example.car_park.service;

import com.example.car_park.entity.BookingOffice;
import com.example.car_park.entity.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
    Car create(Car car);

    void delete(String licensePlate);

    List<Car> findByLicensePlate(String licensePlate);

    List<Car> findAll();

    List<Car> findCarByTypeAndColor(@Param("carColor") String carColor, @Param("carType") String carType);


}
