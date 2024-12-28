package com.example.HospitalManagment.service;


import com.example.HospitalManagment.entity.Hospital;
import com.example.HospitalManagment.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    @Autowired
    HospitalRepository hospitalRepository;

    public List<Hospital> showallhospital(){
        return hospitalRepository.findAll();
    }

    public Optional<Hospital> showHospitalById(Integer id){
        return hospitalRepository.findById(id);
    }

    public void delete(){
        hospitalRepository.deleteAll();
    }

    public void deletebyId(Integer id){
        hospitalRepository.deleteById(id);
    }

    public Hospital addHospital(Hospital hospital)
    {
        return hospitalRepository.save(hospital);
    }

    public Hospital updateHospital(Hospital hospital){
        if (hospitalRepository.existsById(hospital.getId())) {
            return hospitalRepository.save(hospital);
        }
        return null;
    }

}
