package com.example.DoctorDataManagement.controller;

import com.example.DoctorDataManagement.dao.DoctorRepository;
import com.example.DoctorDataManagement.model.Doctor;
import com.example.DoctorDataManagement.model.Petient;
import com.example.DoctorDataManagement.service.Patientservice;
import jakarta.annotation.Nullable;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class PetioentController {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    Patientservice service;
    @PostMapping("petient")
    public String addPetient(@RequestBody String petiontrequest){
        JSONObject json=new JSONObject(petiontrequest);
        Petient petient=setPatient(json);
        service.savePatient(petient);
        return "patient is save successfully";
    }


    public Petient setPatient(JSONObject json){
      Petient patient=new Petient();
      patient.setPetientId(json.getInt("petientId"));
      patient.setPetientName(json.getString("petientName"));
      patient.setAge(json.getInt("age"));
      patient.setPhoneNumber(json.getString("phoneNumber"));
      patient.setDiseseType(json.getString("diseseType"));
      patient.setGender(json.getString("gender"));
        Timestamp currTime=new Timestamp(System.currentTimeMillis());
      patient.setAdmitDate(currTime);
      String doctorId=json.getString("doctorId");
      Doctor doctor= doctorRepository.findById(Integer.valueOf(doctorId)).get();
      patient.setDoctorId(doctor);
      return patient;
    }

    @GetMapping("get-petionts")
    public List<Petient>getPatientwithDeoctorid(@Nullable @RequestParam String doctorId,
                                                @Nullable @RequestParam String patientId){

         return null;
    }
}
