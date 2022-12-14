package com.example.car_park.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)

    public ErrorResponse handlerNotFoundException(NotFoundException ex, WebRequest request){
        return new ErrorResponse(HttpStatus.NOT_FOUND,ex.getMessage());
    }

    @ExceptionHandler(NotInvalidException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)

    public  ErrorResponse handlerNotInvalidException(NotInvalidException ex,WebRequest request){
        return new ErrorResponse(HttpStatus.NOT_ACCEPTABLE,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Exception handlerException( ){

        return new Exception();
    }

}
