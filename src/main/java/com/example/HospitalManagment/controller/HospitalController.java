package com.example.HospitalManagment.controller;


import com.example.HospitalManagment.entity.Hospital;
import com.example.HospitalManagment.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/show")
    public List<Hospital> showall()
    {
        return hospitalService.showallhospital();
    }

    @PostMapping("/add")
    public Hospital addhospital(@RequestBody Hospital hospital){
        return hospitalService.addHospital(hospital );
    }


    @DeleteMapping("/delete")
    public void deleteAll(){
        hospitalService.delete();
    }

    @PutMapping("/update/{id}")
    public Hospital update(@PathVariable ("id") Integer id ,@RequestBody Hospital hospital ){
        return hospitalService.updateHospital(hospital);
    }
}
