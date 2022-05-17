package com.revature.PeopleList.controller;

import com.revature.PeopleList.model.Ethnicity;
import com.revature.PeopleList.model.Gender;
import com.revature.PeopleList.model.Person;
import com.revature.PeopleList.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PeronControllerTest {
    @Mock
    private PersonService personService;

    @InjectMocks
    private PersonController personController;

    Gender gender1 = new Gender(1,"Male");
    Gender gender2 = new Gender(2, "Female");

    Ethnicity ethnicity1 = new Ethnicity(1, "White");
    Ethnicity ethnicity2 = new Ethnicity(2, "Black");

    Person person1 = new Person(1, "John FreeBird", 62, gender1, ethnicity2);
    Person person2 = new Person(2, "Stacy Karenface", 51, gender2, ethnicity1);

    @Test
    void getAllPeople(){
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        when(personService.getAllPeople()).thenReturn(people);
        ResponseEntity<?> response = personController.getAllPeople();
        assertThat(response.getBody()).isEqualTo(people);
    }
}
