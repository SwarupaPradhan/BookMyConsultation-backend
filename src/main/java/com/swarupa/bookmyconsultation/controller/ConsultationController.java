package com.swarupa.bookmyconsultation.controller;

import com.swarupa.bookmyconsultation.dto.ConsultationRequestDTO;
import com.swarupa.bookmyconsultation.dto.ConsultationResponseDTO;
import com.swarupa.bookmyconsultation.service.ConsultationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultations")
public class ConsultationController {

    private final ConsultationService service;

    public ConsultationController(ConsultationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ConsultationResponseDTO> create(@RequestBody ConsultationRequestDTO request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createConsultation(request));
    }

    @GetMapping
    public List<ConsultationResponseDTO> getAll() {
        return service.getAllConsultations();
    }

    @GetMapping("/{id}")
    public ConsultationResponseDTO getById(@PathVariable Long id) {
        return service.getConsultationById(id);
    }

    @PutMapping("/{id}")
    public ConsultationResponseDTO update(@PathVariable Long id, @RequestBody ConsultationRequestDTO request) {
        return service.updateConsultation(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteConsultation(id);
        return ResponseEntity.noContent().build();
    }
}
