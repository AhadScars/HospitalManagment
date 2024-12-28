package com.example.HospitalManagment.service;

import com.example.HospitalManagment.entity.Doctor;
import com.example.HospitalManagment.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public List<Doctor> showallDoctor(){
        return doctorRepository.findAll();

    }

    public Optional<Doctor> findbyId(Integer id){
        return doctorRepository.findById(id);
    }

    public void deleteAll()
    {
        doctorRepository.deleteAll();
    }
    public void deletebyid(Integer id){
        doctorRepository.deleteById(id);
    }

    public Doctor update(Doctor doctor){
        return doctorRepository.save(doctor);
    }
}

