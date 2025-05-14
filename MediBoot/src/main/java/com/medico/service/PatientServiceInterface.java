package com.medico.service;

import java.util.List;

import com.medico.model.Patient;

public interface PatientServiceInterface {
    Patient addPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient updatePatient(Long id, Patient updatedPatient);
    void deletePatient(Long id);
    List<Patient> searchByName(String name);
    long countPatients();
}
