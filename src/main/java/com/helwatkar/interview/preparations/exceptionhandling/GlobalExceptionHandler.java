package com.helwatkar.interview.preparations.exceptionhandling;

import com.helwatkar.interview.preparations.dto.ErrorResponseObj;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return ResponseEntity.status(500).body("An unexpected error occurred: " + ex.getMessage());
    }

    @ExceptionHandler(ResourceNotANumberException.class)
    public ResponseEntity<ErrorResponseObj> handleResourceNotNumberException(ResourceNotANumberException ex) {
        ErrorResponseObj errorResponse = new ErrorResponseObj();
        errorResponse.setErrorMsg("Resource could not be found as a valid response with exception message as : " + ex.getMessage());
        errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setTimestamp(Instant.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
