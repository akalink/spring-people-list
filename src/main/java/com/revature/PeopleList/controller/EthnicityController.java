package com.revature.PeopleList.controller;

import com.revature.PeopleList.model.Ethnicity;
import com.revature.PeopleList.service.EthnicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EthnicityController {

    @Autowired
    EthnicityService ethnicityService;

    @GetMapping("/ethnicity/{ethnicity_id}")
    public ResponseEntity<?> getEthnicityById(@PathVariable("ethnicity_id") String ethnicityId){
        Integer id = Integer.parseInt(ethnicityId);
        Ethnicity ethnicity = ethnicityService.getEthnicity(id);
        return ResponseEntity.ok().body(ethnicity);
    }

    @GetMapping("/ethnicity")
    public ResponseEntity<?> getEthnicity(){
        List<Ethnicity> ethnicities = ethnicityService.getAllEthnicity();
        return ResponseEntity.ok().body(ethnicities);
    }
}
