package com.project.pokemon.advice;

import com.project.pokemon.exception.CsvFileHasWrongFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<?> handleAllExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<String>("The server has encountered an error.", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CsvFileHasWrongFormatException.class)
    public final ResponseEntity<?> handleCsvFileHasWrongFormat(Exception ex, WebRequest request) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
    }
}
