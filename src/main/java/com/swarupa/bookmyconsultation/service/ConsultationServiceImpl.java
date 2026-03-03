package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.dto.ConsultationRequestDTO;
import com.swarupa.bookmyconsultation.dto.ConsultationResponseDTO;
import com.swarupa.bookmyconsultation.entity.Consultation;
import com.swarupa.bookmyconsultation.exception.ResourceNotFoundException;
import com.swarupa.bookmyconsultation.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultationServiceImpl implements ConsultationService {

    private final ConsultationRepository repository;

    public ConsultationServiceImpl(ConsultationRepository repository) {
        this.repository = repository;
    }

    @Override
    public ConsultationResponseDTO createConsultation(ConsultationRequestDTO request) {
        Consultation entity = new Consultation();
        entity.setPatientName(request.getPatientName());
        entity.setDoctorName(request.getDoctorName());
        entity.setConsultationDate(request.getConsultationDate());
        entity.setStatus(request.getStatus());

        Consultation saved = repository.save(entity);
        return mapToDTO(saved);
    }

    @Override
    public List<ConsultationResponseDTO> getAllConsultations() {
        return repository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public ConsultationResponseDTO getConsultationById(Long id) {
        Consultation entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Consultation not found with id " + id));
        return mapToDTO(entity);
    }

    @Override
    public ConsultationResponseDTO updateConsultation(Long id, ConsultationRequestDTO request) {
        Consultation entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Consultation not found with id " + id));

        entity.setPatientName(request.getPatientName());
        entity.setDoctorName(request.getDoctorName());
        entity.setConsultationDate(request.getConsultationDate());
        entity.setStatus(request.getStatus());

        Consultation updated = repository.save(entity);
        return mapToDTO(updated);
    }

    @Override
    public void deleteConsultation(Long id) {
        Consultation entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Consultation not found with id " + id));
        repository.delete(entity);
    }

    private ConsultationResponseDTO mapToDTO(Consultation entity) {
        ConsultationResponseDTO dto = new ConsultationResponseDTO();
        dto.setId(entity.getId());
        dto.setPatientName(entity.getPatientName());
        dto.setDoctorName(entity.getDoctorName());
        dto.setConsultationDate(entity.getConsultationDate());
        dto.setStatus(entity.getStatus());
        return dto;
    }
}
