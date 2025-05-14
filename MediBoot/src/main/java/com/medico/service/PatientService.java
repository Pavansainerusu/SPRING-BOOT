package com.medico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medico.exception.PatientNotFoundException;
import com.medico.model.Patient;
import com.medico.repository.PatientRepository;

@Service
public class PatientService implements PatientServiceInterface {

    @Autowired
    private PatientRepository repository;

    @Override
    public Patient addPatient(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }

    public Patient updatePatient(Long id, Patient updatedData) {
        Patient existing = repository.findById(id)
            .orElseThrow(() -> new PatientNotFoundException(id));

        existing.setName(updatedData.getName());
        existing.setAge(updatedData.getAge());
        existing.setGender(updatedData.getGender());
        existing.setDiagnosis(updatedData.getDiagnosis());

        return repository.save(existing); // Hibernate knows this object
    }



    @Override
    public void deletePatient(Long id) {
        if (!repository.existsById(id)) {
            throw new PatientNotFoundException(id);
        }
        repository.deleteById(id); // Safely deletes by ID
    }


    @Override
    public List<Patient> searchByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public long countPatients() {
        return repository.count();
    }


}