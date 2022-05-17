package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.GenderReposity;
import com.revature.PeopleList.model.Gender;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
    public void getGenderById(){
        Gender gender = new Gender(1,"Male");
        when(genderReposity.findById(1)).thenReturn(Optional.of(gender));
        Gender actual = genderService.getGender(1);
        assertThat(actual).isEqualTo(gender);
    }
}
