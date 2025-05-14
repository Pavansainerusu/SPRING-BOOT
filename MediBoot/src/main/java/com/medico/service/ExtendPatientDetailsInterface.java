package com.medico.service;

import com.medico.model.ExtendedPatientDetails;

public interface ExtendPatientDetailsInterface {

	ExtendedPatientDetails addDetailsToPatient(Long patientId, ExtendedPatientDetails details);

	ExtendedPatientDetails getDetailsById(Long id) throws Throwable;

}
