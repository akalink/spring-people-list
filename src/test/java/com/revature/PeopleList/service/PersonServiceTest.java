package com.revature.PeopleList.service;


import com.revature.PeopleList.dao.PersonRepository;
import com.revature.PeopleList.model.Ethnicity;
import com.revature.PeopleList.model.Gender;
import com.revature.PeopleList.model.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    public void createPersonPositive(){
        Gender gender = new Gender(1,"Male");
        Ethnicity ethnicity = new Ethnicity(1, "White");
        Person person = new Person(1,"Mike Cred", 16, gender, ethnicity);

        when(personRepository.save(person)).thenReturn(person);

        Person actual = personService.createPerson(person);

        assertThat(actual).isEqualTo(person);

    }

    @Test
    public void createPersonNegative(){
        Gender gender = new Gender(1,"Male");
        Ethnicity white = new Ethnicity(1, "White");
        Gender woman = new Gender(2, "Female");
        Person person = new Person(1,"Mike Cred", 16, gender, white);
        Person person1 = new Person(2,"Laura", 28, woman, white);

        when(personRepository.save(person)).thenReturn(person);

        Person actual = personService.createPerson(person);

        assertThat(actual).isNotEqualTo(person1);
    }

    @Test
    public void getPeoplePositive(){
        List<Person> people = personService.getAllPeople();
        assertThat(people).isNotNull();
    }


}
