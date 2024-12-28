package com.example.HospitalManagment.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patient
{

    @Id

    private Integer id;

    private String name;
    private String address;
    private String email;
    private Integer phoneNumber;
}

