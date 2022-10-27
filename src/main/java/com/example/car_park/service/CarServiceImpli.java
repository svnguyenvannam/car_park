package com.example.car_park.service;

import com.example.car_park.entity.BookingOffice;
import com.example.car_park.entity.Car;
import com.example.car_park.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpli implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Car create(Car car) {

        return carRepository.save(car);
    }

    @Override
    public void delete(String licensePlate)
    {

        carRepository.deleteById(licensePlate);
    }
    @Override
    public List<Car> findByLicensePlate(String licensePlate) {

        return carRepository.findByLicensePlate(licensePlate);
    }
    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public List<Car> findCarByTypeAndColor(@Param("carColor") String carColor, @Param("carType") String carType){
        return carRepository.findCarByTypeAndColor(carColor,carType);
    }

}
