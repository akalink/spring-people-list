package com.revature.PeopleList.controller;

import com.revature.PeopleList.dto.PersonDTO;
import com.revature.PeopleList.model.Person;
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

    @PostMapping("/Person")
    public Person createPerson(@RequestBody Person person){

        return personService.createPerson(person);
    }

    @GetMapping("/Person")
    public ResponseEntity<?> getAllPeople(){
        List<Person> people = personService.getAllPeople();
        return ResponseEntity.ok().body(people);
    }
}
