package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.entity.Doctor;
import com.swarupa.bookmyconsultation.entity.Address;
import com.swarupa.bookmyconsultation.exception.InvalidInputException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public void validateDoctor(Doctor doctor) throws InvalidInputException {
        if (doctor.getAddress() == null) {
            throw new InvalidInputException(List.of("Address cannot be null"));
        }
    }

}
