package com.example.HospitalManagment.controller;


import com.example.HospitalManagment.entity.Doctor;
import com.example.HospitalManagment.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService ;

    @GetMapping("/show")
    public List<Doctor> show (){
        return doctorService.showallDoctor();
    }

    @PostMapping("/add")
    public Doctor add(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    }

    @DeleteMapping("/delete")
    public void deleteall(){
        doctorService.deleteAll();
    }
}
