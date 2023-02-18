package com.example.DoctorDataManagement.dao;

import com.example.DoctorDataManagement.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}
