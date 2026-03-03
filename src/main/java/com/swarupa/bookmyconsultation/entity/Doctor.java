package com.swarupa.bookmyconsultation.entity;

import com.swarupa.bookmyconsultation.enums.Speciality;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String emailId;
    private String mobile;
    private String pan;
    private String dob;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
