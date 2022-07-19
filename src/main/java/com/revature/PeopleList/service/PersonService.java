package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.PersonRepository;

import com.revature.PeopleList.dto.PersonDTO;
import com.revature.PeopleList.exception.NotFound;
import com.revature.PeopleList.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Person> getPerson(int id){
        return personRepository.findById(id);
    }

    public Person editPerson(int id, PersonDTO newDetails) throws NotFound {
        Optional<Person> person = personRepository.findById(id);
        if(person.isPresent()){
            Person details = new Person(newDetails.getId(), newDetails.getFullName(), newDetails.getAge(), newDetails.getGender(), newDetails.getEthnicity());
            return personRepository.save(details);
        } else {
            throw new NotFound("User with ID "+ id + " does not exist");
        }
    }

    public Boolean deletePerson(int id){
        personRepository.deleteById(id);
        return !personRepository.existsById(id);
    }

}
