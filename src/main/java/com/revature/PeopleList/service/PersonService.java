package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.PersonRepository;

import com.revature.PeopleList.dto.PersonDTO;
import com.revature.PeopleList.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person createPerson(Person person){
        personRepository.save(person);
        return person;
    }

    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }


}
