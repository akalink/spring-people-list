package com.revature.PeopleList.controller;

import com.revature.PeopleList.dto.PersonDTO;

import com.revature.PeopleList.model.Ethnicity;
import com.revature.PeopleList.model.Gender;
import com.revature.PeopleList.model.Person;

import com.revature.PeopleList.service.EthnicityService;
import com.revature.PeopleList.service.GenderService;
import com.revature.PeopleList.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    GenderService genderService;

    @Autowired
    EthnicityService ethnicityService;



    @PostMapping("/Person")
    public Person createPerson(@RequestBody PersonDTO personDTO){
        Gender gender = genderService.getGender(personDTO.getGender().getId());
        Ethnicity ethnicity = ethnicityService.getEthnicity(personDTO.getEthnicity().getId());
        Person person = new Person(personDTO.getId(), personDTO.getFullName(), personDTO.getAge(), gender, ethnicity);
        if(person == null){
            ResponseEntity.status(400).body("Not a valid person.");
            return null;
        }
        return personService.createPerson(person);
    }

    @GetMapping("/Person")
    public ResponseEntity<?> getAllPeople(){
        List<Person> people = personService.getAllPeople();
        return ResponseEntity.ok().body(people);
    }
}
