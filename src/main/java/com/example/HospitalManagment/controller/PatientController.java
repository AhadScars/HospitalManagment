package com.example.HospitalManagment.controller;


import com.example.HospitalManagment.entity.Patient;
import com.example.HospitalManagment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
public class PatientController {


    @Autowired
    PatientService patientService;


    @PostMapping("/add")
    public ResponseEntity<String> adddoctor(@RequestBody Patient patient  ){
        Patient addpatient = patientService.addpatient(patient);
        return new ResponseEntity<>("patient added Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/show")
    public ResponseEntity<?> show(){
        List<Patient> patients = patientService.showallpatient();
        if (patients.isEmpty()){
            return new ResponseEntity<>("patient is empty", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(patients,HttpStatus.OK);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<?> showbyid(@PathVariable Integer id){
        Optional<Patient> showbyid= patientService.findbyId(id);
        if (showbyid.isEmpty()){
            return new ResponseEntity<>("not found",HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(showbyid,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete (){
        patientService.deleteAll();
        return new ResponseEntity<>("deleteaLL",HttpStatus.OK);
    }
}

