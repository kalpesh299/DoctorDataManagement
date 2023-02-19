package com.example.DoctorDataManagement.controller;


import com.example.DoctorDataManagement.model.Doctor;
import com.example.DoctorDataManagement.service.DoctorService;
import jakarta.annotation.Nullable;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService service;
//  ----------------------------------------------
//    @PostMapping("/add-doctor")
//    public Doctor saveDoctor(@RequestBody String requestDoctor){
//        JSONObject json=new JSONObject(requestDoctor);
//      Doctor doctor=validateDoctor(json);
//
//      if(doctor!=null){
//          return service.saveDoctor(doctor);
//      }
//      return  null ;
//    }
    //------------------------------------------------------------
//testing

    //http://localhost:8080/add-doctor
    @PostMapping("/add-doctor")
    public ResponseEntity<String>saveDoctor(@RequestBody String requestDoctor){
        JSONObject json=new JSONObject(requestDoctor);
        Doctor doctor=validateDoctor(json);

        if(doctor!=null){
            service.saveDoctor(doctor);
            return new ResponseEntity<>("Doctors Data has been save", HttpStatus.CREATED);
        }
         return new ResponseEntity<>("Bad Request Entor All mendtory details", HttpStatus.BAD_REQUEST);
    }

    //http://localhost:8080/get-doctor
    @GetMapping("/get-doctor")
    public List <Doctor>getDoctor(@Nullable @RequestParam String doctorId){
        return service.getDoctor(doctorId);
    }


   public Doctor validateDoctor(JSONObject json){
        Doctor doctor=new Doctor();
        if(json.has("doctorId")){
            int doctorId=(int)json.get("doctorId");
            doctor.setDoctorId(doctorId);
        }else {
            return null;
        }

       if(json.has("doctorName")){
           String doctorName=json.getString("doctorName");
           doctor.setDoctorName(doctorName);
       }else {
           return null;
       }

       if(json.has("specializationIn")){
           String specializationIn= json.getString("specializationIn");
           doctor.setSpecializationIn(specializationIn);
       }else{
           return null;
       }

       if(json.has("excperience")){
           String experience=json.getString("excperience");
           doctor.setExcperience(experience);
       }

  return doctor;
   }




}
