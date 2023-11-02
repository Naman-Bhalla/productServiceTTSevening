package dev.naman.productservicettsevening.controllers;

import dev.naman.productservicettsevening.dtos.ErrorResponseDto;
import dev.naman.productservicettsevening.exceptions.NotFoundException;
//import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvices {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> naman(Exception exception) {
//        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
//        errorResponseDto.setErrorMessage(exception.getMessage());
//
//        return new ResponseEntity<>(errorResponseDto, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>("Phat gaya", HttpStatus.OK);
    }


//    @Test
//    void testingIfAnandIsAskingCorrectQuestion() {
//        assert false;
//    }
}
