package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.entity.Appointment;
import org.springframework.stereotype.Service;
import java.time.ZonedDateTime;

@Service
public class AppointmentService {

    public void processAppointment(Appointment appointment) {
        Long doctorId = appointment.getDoctor().getId();
        String timeSlot = appointment.getTimeSlot();
        ZonedDateTime date = appointment.getAppointmentDate();
        Long appointmentId = appointment.getAppointmentId();

        // Your logic here
    }

}
