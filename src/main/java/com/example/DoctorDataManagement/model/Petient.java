package com.example.DoctorDataManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name="tbl_petient")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Petient {

    @Id
    @Column(name="petient_id")
    private String petientId;

    @Column(name="petient_name")
    private String petientName;
    @Column(name="petient_age")
    private Integer age;


    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="disese_type")
    private String diseseType;

    @Column(name="petient_gender")
    private String gender;

@Column(name="admit_date")
private Timestamp admitDate;
    @JoinColumn(name="doctor_id")
    @ManyToOne
    private Doctor doctorId;//we always write the class name thats why i have use Doctor here



}
