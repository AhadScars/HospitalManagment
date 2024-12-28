package com.example.HospitalManagment.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Hospital {

    @Id
    private Integer id;
    private String hospitalname;
}
