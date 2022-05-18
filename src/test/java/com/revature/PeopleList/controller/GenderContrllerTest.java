package com.revature.PeopleList.controller;

import com.revature.PeopleList.model.Gender;
import com.revature.PeopleList.model.Person;
import com.revature.PeopleList.service.GenderService;
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
public class GenderContrllerTest {

    @Mock
    private GenderService genderService;

    @InjectMocks
    private GenderController genderController;

    Gender gender1 = new Gender(1,"Male");
    Gender gender2 = new Gender(2, "Female");

    @Test
    public void getGenderById() throws Exception{
        when(genderService.getGender(1)).thenReturn(gender1);
        ResponseEntity<?> response = genderController.getGenderById("1");
        assertThat(response.getBody()).isEqualTo(gender1);
    }

    @Test
    public void getAllGenders() throws Exception {
        List<Gender> genders = new ArrayList<>();
        genders.add(gender1);
        genders.add(gender2);
        when(genderService.getAllGender()).thenReturn(genders);
        ResponseEntity<?> response = genderController.getAllGenders();
        assertThat(response.getBody()).isEqualTo(genders);
    }

}
