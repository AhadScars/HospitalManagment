package com.example.HospitalManagment.service;

import com.example.HospitalManagment.entity.Appointment;
import com.example.HospitalManagment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;


    public Appointment addappointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> showallapointment(){
        return appointmentRepository.findAll();

    }

    public Optional<Appointment> findbyId(Integer id){
        return appointmentRepository.findById(id);
    }

    public void deleteAll()
    {
        appointmentRepository.deleteAll();
    }
    public void deletebyid(Integer id){
        appointmentRepository.deleteById(id);
    }

    public Appointment update(Appointment appointment){
        return appointmentRepository.save(appointment);
    }
}

