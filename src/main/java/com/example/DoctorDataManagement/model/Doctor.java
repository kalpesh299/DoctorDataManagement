package com.example.DoctorDataManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="table_doctor")
public class Doctor {
    @Id
    @Column(name="doctorid")
    private int doctorId;

    @Column(name="doctor_name")
    private String doctorName;


    @Column(name="dr_experience")
    private String excperience;

    @Column(name="specialization_in")
    private String specializationIn;
}