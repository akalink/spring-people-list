package com.revature.PeopleList.controller;

import com.revature.PeopleList.dto.GenderDTO;
import com.revature.PeopleList.model.Gender;
import com.revature.PeopleList.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GenderController {

    @Autowired
    GenderService genderService;

    @GetMapping("/gender/{gender_id}")
    public ResponseEntity<?> getGenderById(@PathVariable("gender_id") String genderId){
        Integer id = Integer.parseInt(genderId);
        Gender gender = genderService.getGender(id);
        return ResponseEntity.ok().body(gender);
    }

    @GetMapping("/gender")
    public ResponseEntity<?> getAllGenders(){
        List<Gender> genders = genderService.getAllGender();
        return ResponseEntity.ok().body(genders);
    }

}
