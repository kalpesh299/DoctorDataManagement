package com.example.DoctorDataManagement.controller;

import com.example.DoctorDataManagement.model.Petient;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetioentController {

    @PostMapping("petient")
    public ResponseEntity<String>addPetient(@RequestBody String petiontrequest){
        JSONObject json=new JSONObject(petiontrequest);
        Petient petient=setPatient(json);
    }

    public Petient setPatient(JSONObject json){
            
    }
}
