package com.example.car_park.repository;

import com.example.car_park.entity.BookingOffice;
import com.example.car_park.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CarRepository extends JpaRepository<Car,String> {


    @Query(value = "SELECT * FROM Car c WHERE c.carColor = :carColor and c.carType = :carType", nativeQuery = true)
    List<Car> findCarByTypeAndColor(@Param("carColor") String carColor, @Param("carType") String carType);

    List<Car> findByLicensePlate(String licensePlate);
}
