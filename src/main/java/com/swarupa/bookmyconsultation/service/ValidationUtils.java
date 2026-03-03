package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.entity.User;
import com.swarupa.bookmyconsultation.entity.Doctor;
import com.swarupa.bookmyconsultation.entity.Appointment;
import com.swarupa.bookmyconsultation.exception.InvalidInputException;

import java.util.ArrayList;
import java.util.List;

public class ValidationUtils {

    public static void validateUser(User user) throws InvalidInputException {
        List<String> errors = new ArrayList<>();
        if (user.getEmail() == null) errors.add("Email cannot be null");
        if (user.getFirstName() == null) errors.add("First name required");
        if (!errors.isEmpty()) throw new InvalidInputException(errors);
    }

    public static void validateDoctor(Doctor doctor) throws InvalidInputException {
        List<String> errors = new ArrayList<>();
        if (doctor.getFirstName() == null) errors.add("Doctor first name required");
        if (doctor.getAddress() == null) errors.add("Address required");
        if (!errors.isEmpty()) throw new InvalidInputException(errors);
    }

    public static void validateAppointment(Appointment appointment) throws InvalidInputException {
        List<String> errors = new ArrayList<>();
        if (appointment.getDoctor() == null) errors.add("Doctor required");
        if (appointment.getUser() == null) errors.add("User required");
        if (appointment.getTimeSlot() == null) errors.add("TimeSlot required");
        if (!errors.isEmpty()) throw new InvalidInputException(errors);
    }
}
