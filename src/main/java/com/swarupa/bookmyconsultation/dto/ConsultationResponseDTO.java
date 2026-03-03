package com.swarupa.bookmyconsultation.dto;

import java.time.LocalDate;

public class ConsultationResponseDTO {
    private Long id;
    private String patientName;
    private String doctorName;
    private LocalDate consultationDate;
    private String status;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public LocalDate getConsultationDate() { return consultationDate; }
    public void setConsultationDate(LocalDate consultationDate) { this.consultationDate = consultationDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
