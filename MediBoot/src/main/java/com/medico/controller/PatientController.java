package com.medico.controller;

import java.util.List;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medico.model.Patient;
import com.medico.repository.ExtendedPatientDetailsRepository;
import com.medico.service.PatientServiceInterface;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/patients")
@Tag(name = "Patient Controller", description = "Handles patient CRUD operations")
public class PatientController {

    private static final Logger logger = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    @Lazy
    private PatientServiceInterface service;

    @Autowired
    private ExtendedPatientDetailsRepository detailsRepository;

    @PostMapping("/add")
    @Operation(summary = "Add new patient", description = "Creates a new patient record.")
    public Patient addPatient(@RequestBody Patient patient) {
        logger.info("Adding new patient: {}", patient);
        return service.addPatient(patient);
    }

    @GetMapping("/all")
    @Operation(summary = "Get all patients", description = "Fetches all patient records.")
    public List<Patient> getAllPatients() {
        logger.info("Fetching all patients");
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get patient by ID", description = "Fetches a patient by their unique ID.")
    public Patient getPatientById(
            @Parameter(description = "ID of the patient to fetch") @PathVariable Long id) {
        logger.info("Fetching patient with ID: {}", id);
        return service.getPatientById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update patient", description = "Updates an existing patient record by ID.")
    public Patient updatePatient(
            @Parameter(description = "ID of the patient to update") @PathVariable Long id,
            @RequestBody Patient patient) {
        logger.info("Updating patient with ID: {} with data: {}", id, patient);
        return service.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete patient", description = "Deletes a patient record by ID.")
    public void deletePatient(
            @Parameter(description = "ID of the patient to delete") @PathVariable Long id) {
        logger.info("Deleting patient with ID: {}", id);
        service.deletePatient(id);
    }

    @GetMapping("/search")
    @Operation(summary = "Search patients by name", description = "Finds patients whose name matches the given string.")
    public List<Patient> searchByName(
            @Parameter(description = "Name to search for") @RequestParam String name) {
        logger.info("Searching patients by name: {}", name);
        return service.searchByName(name);
    }

    @GetMapping("/count")
    @Operation(summary = "Count total patients", description = "Returns the total number of patients.")
    public long countPatients() {
        logger.info("Counting all patients");
        return service.countPatients();
    }
}
