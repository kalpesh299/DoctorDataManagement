package com.example.DoctorDataManagement.dao;

import com.example.DoctorDataManagement.model.Petient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Petient,Integer> {
}
