package com.swarupa.bookmyconsultation.exception;

import java.util.List;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(List<String> errors) {
        //TODO Auto-generated constructor stub
    }
}
