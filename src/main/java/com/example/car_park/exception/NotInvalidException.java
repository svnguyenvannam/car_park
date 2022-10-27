package com.example.car_park.exception;

public class NotInvalidException extends RuntimeException{

    public NotInvalidException (String message){
        super(message);
    }
}
