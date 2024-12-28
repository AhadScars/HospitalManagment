package com.example.HospitalManagment.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Doctor
{
    @Id

    private Integer id;

    private String name;
    private String specialization;
    private String phoneNumber;
}
