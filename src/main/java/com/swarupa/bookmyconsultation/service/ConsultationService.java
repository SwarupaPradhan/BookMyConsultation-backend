package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.dto.ConsultationRequestDTO;
import com.swarupa.bookmyconsultation.dto.ConsultationResponseDTO;
import java.util.List;

public interface ConsultationService {
    ConsultationResponseDTO createConsultation(ConsultationRequestDTO request);
    List<ConsultationResponseDTO> getAllConsultations();
    ConsultationResponseDTO getConsultationById(Long id);
    ConsultationResponseDTO updateConsultation(Long id, ConsultationRequestDTO request);
    void deleteConsultation(Long id);
}
