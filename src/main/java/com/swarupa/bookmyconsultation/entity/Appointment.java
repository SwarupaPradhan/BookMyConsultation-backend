package com.swarupa.bookmyconsultation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @ManyToOne
    private User user;

    @ManyToOne
    private Doctor doctor;

    private String timeSlot; // e.g., "10:00-10:30"
    private ZonedDateTime appointmentDate;

}
