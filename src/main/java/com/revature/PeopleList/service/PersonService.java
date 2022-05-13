package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.PersonRepository;

import com.revature.PeopleList.dto.PersonDTO;
import com.revature.PeopleList.model.Person;
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
