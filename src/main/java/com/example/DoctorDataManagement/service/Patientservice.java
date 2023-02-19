package com.example.DoctorDataManagement.service;

import com.example.DoctorDataManagement.dao.PatientRepository;
import com.example.DoctorDataManagement.model.Petient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Patientservice {

    @Autowired
    PatientRepository patientRepository;
    public void savePatient(Petient patient){
         patientRepository.save(patient);
    }
}
