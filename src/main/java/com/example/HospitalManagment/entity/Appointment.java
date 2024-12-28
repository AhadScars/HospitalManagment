package com.example.HospitalManagment.entity;


import com.example.HospitalManagment.service.HospitalService;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Appointment
{
    @Id

    private Integer id;
    private String appointmentday;


   @ManyToOne
  @JoinColumn(name = "patient_id")

    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;


}
