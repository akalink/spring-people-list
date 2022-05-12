package com.revature.service;

import com.revature.dao.PersonRepository;

import com.revature.dto.PersonDTO;
import com.revature.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public PersonDTO createPerson(Person person){
        personRepository.save(person);
        return new PersonDTO(person.getId(), person.getFullName(), person.getAge(), person.getGender(), person.getEthnicity());
    }


}
