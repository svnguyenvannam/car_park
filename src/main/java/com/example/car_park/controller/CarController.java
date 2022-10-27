package com.example.car_park.controller;

import com.example.car_park.entity.Car;
import com.example.car_park.exception.NotFoundException;
import com.example.car_park.exception.NotInvalidException;
import com.example.car_park.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/")
    public Car create(@RequestBody @Valid Car car) throws NotInvalidException {

        return carService.create(car);
    }


    @DeleteMapping("/{licensePlate}")
    public void delete(@PathVariable @Valid String licensePlate) {

        carService.delete(licensePlate);

    }

    @GetMapping("/cars")
    public List<Car> findAll() {
        return carService.findAll();
    }

    @GetMapping("/{licensePlate}")
    public Car findCarByLicensePlate(@PathVariable @Valid String licensePlate) {
        List<Car> cars = carService.findByLicensePlate(licensePlate);
        if (cars == null) {
            throw new NotFoundException("Không có car đó trong danh sách");
        }
        return (Car) cars;
    }

    @GetMapping("/{carColor}/{carType}")
    public List<Car> findCarByTypeAndColor(@RequestParam(value = "carColor") String carColor, @RequestParam(value = "carType") String carType) {

        return carService.findCarByTypeAndColor(carColor, carType);
    }
}
