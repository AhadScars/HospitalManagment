package com.example.HospitalManagment.controller;


import com.example.HospitalManagment.entity.Appointment;
import com.example.HospitalManagment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService
    appointmentService;

    @GetMapping("/app")
    public List<Appointment> get()
    {
        return appointmentService.showallapointment();
    }

    @PostMapping("/add")
    public Appointment add(@RequestBody Appointment appointment){
        return appointmentService.addappointment(appointment);
    }

    @DeleteMapping("/delete")
    public void deleteall(){
        appointmentService.deleteAll();
    }
}
