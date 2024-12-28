package com.example.HospitalManagment.repository;

import com.example.HospitalManagment.entity.Appointment;
import com.example.HospitalManagment.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}
