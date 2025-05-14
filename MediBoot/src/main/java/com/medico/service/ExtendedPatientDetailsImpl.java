package com.medico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medico.model.ExtendedPatientDetails;
import com.medico.model.Patient;
import com.medico.repository.ExtendedPatientDetailsRepository;
import com.medico.repository.PatientRepository;
@Service
public class ExtendedPatientDetailsImpl implements ExtendPatientDetailsInterface {
	  @Autowired
	    private ExtendedPatientDetailsRepository extendedPatientDetailsRepository;

	    @Autowired
	    private PatientRepository patientRepository;

	    @Override
	    public ExtendedPatientDetails addDetailsToPatient(Long patientId, ExtendedPatientDetails details) {
	        // Find the patient by patientId
	        Patient patient = patientRepository.findById(patientId)
	                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + patientId));

	        // Associate the patient with the extended details
	        details.setPatient(patient);

	        // Save and return the extended patient details
	        return (ExtendedPatientDetails) extendedPatientDetailsRepository.save(details);
	    }

	    @Override
	    public ExtendedPatientDetails getDetailsById(Long id) throws Throwable {
	        // Retrieve extended details by ID
	        return (ExtendedPatientDetails) extendedPatientDetailsRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Extended patient details not found with id: " + id));
	    }

}


