package com.example.car_park.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException (String message){
        super(message);
    }
}
