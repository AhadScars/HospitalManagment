package com.example.HospitalManagment.service;


import com.example.HospitalManagment.entity.Patient;
import com.example.HospitalManagment.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient addpatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> showallpatient(){
        return patientRepository.findAll();

    }

    public Optional<Patient> findbyId(Integer id){
        return patientRepository.findById(id);
    }

    public void deleteAll()
    {
        patientRepository.deleteAll();
    }
    public void deletebyid(Integer id){
         patientRepository.deleteById(id);
    }

    public Patient update(Patient patient){
        return patientRepository.save(patient);
    }
}
