package com.example.DoctorDataManagement.service;

import com.example.DoctorDataManagement.dao.DoctorRepository;
import com.example.DoctorDataManagement.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {


    @Autowired
    DoctorRepository doctorrepository;//interface cannot create object but here ites create the dummy class
    public Doctor saveDoctor(Doctor doctor){

        return doctorrepository.save(doctor);

    }

    public List<Doctor> getDoctor(String doctorId){
        List<Doctor>doctorList;
        if(doctorId!=null){
                      doctorList=new ArrayList<>();
            doctorList.add(doctorrepository.findById(Integer.valueOf(doctorId)).get());
        }else{
            doctorList=doctorrepository.findAll();

    }
        return doctorList;}
}
