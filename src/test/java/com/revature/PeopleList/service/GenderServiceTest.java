package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.GenderReposity;
import com.revature.PeopleList.model.Gender;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GenderServiceTest {

    @Mock
    private GenderReposity genderReposity;

    @InjectMocks
    private GenderService genderService;

    @Test
    public void getGenderByIdPositive(){
        Gender gender = new Gender(1,"Male");
        when(genderReposity.findById(1)).thenReturn(Optional.of(gender));
        Gender actual = genderService.getGender(1);
        assertThat(actual).isEqualTo(gender);
    }
    @Test
    public void getGenderByIdNegative(){
        Gender gender = new Gender(1,"Male");
        Gender gender1 = new Gender(2,"Female");
        when(genderReposity.findById(2)).thenReturn(Optional.of(gender1));
        Gender actual = genderService.getGender(2);
        assertThat(actual).isNotEqualTo(gender);
    }

    @Test
    public void getAllGender(){
        List<Gender> genders = genderService.getAllGender();
        AssertionsForClassTypes.assertThat(genders).isNotNull();
    }
}
