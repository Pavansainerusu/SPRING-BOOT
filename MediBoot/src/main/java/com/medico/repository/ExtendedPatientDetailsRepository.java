package com.medico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medico.model.ExtendedPatientDetails;
import io.swagger.v3.oas.annotations.media.Schema;

@Repository
@Schema(description = "Repository for managing extended patient details.")
public interface ExtendedPatientDetailsRepository extends JpaRepository<ExtendedPatientDetails, Long> {

    @Schema(description = "Find extended patient details by patient ID.")
    List<ExtendedPatientDetails> findByPatientId(Long patientId);
}
