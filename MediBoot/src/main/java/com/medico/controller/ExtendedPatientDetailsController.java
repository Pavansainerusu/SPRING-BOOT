package com.medico.controller;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medico.model.ExtendedPatientDetails;
import com.medico.service.ExtendPatientDetailsInterface;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/extended-details")
@Tag(name = "Extended Patient Details", description = "Operations related to extended patient information")
public class ExtendedPatientDetailsController {

    @Autowired
    @Lazy
    private ExtendPatientDetailsInterface detailsService;

    @Operation(
        summary = "Add extended details to a patient",
        description = "Attach extended patient details to a specific patient by patient ID"
    )
    @PostMapping("/patient/{patientId}")
    public ExtendedPatientDetails addDetails(
        @Parameter(description = "ID of the patient to whom details are being added", example = "1")
        @PathVariable Long patientId,

        @Parameter(description = "Extended patient details to add")
        @RequestBody ExtendedPatientDetails details) {

        return detailsService.addDetailsToPatient(patientId, details);
    }

    @Operation(
        summary = "Get extended details by ID",
        description = "Retrieve extended patient details by the detail record's ID"
    )
    @GetMapping("/{id}")
    public ExtendedPatientDetails getDetails(
        @Parameter(description = "ID of the extended details record", example = "1001")
        @PathVariable Long id) throws Throwable {

        return detailsService.getDetailsById(id);
    }
}
