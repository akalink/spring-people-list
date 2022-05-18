package com.revature.PeopleList.controller;

import com.revature.PeopleList.model.Ethnicity;
import com.revature.PeopleList.service.EthnicityService;
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
public class EthnicityControllerTest {
    @Mock
    private EthnicityService ethnicityService;

    @InjectMocks
    private EthnicityController ethnicityController;

    Ethnicity ethnicity1 = new Ethnicity(1,"White");
    Ethnicity ethnicity2 = new Ethnicity(2,"Black");

    @Test
    public void getEthnicityById() throws Exception{
        when(ethnicityService.getEthnicity(1)).thenReturn(ethnicity1);
        ResponseEntity<?> response = ethnicityController.getEthnicityById("1");
        assertThat(response.getBody()).isEqualTo(ethnicity1);
    }

    @Test
    public void getAllEthnicity() throws Exception{
        List<Ethnicity> ethnicities = new ArrayList<>();
        ethnicities.add(ethnicity1);
        ethnicities.add(ethnicity2);
        when(ethnicityService.getAllEthnicity()).thenReturn(ethnicities);
        ResponseEntity<?> response = ethnicityController.getEthnicity();
        assertThat(response.getBody()).isEqualTo(ethnicities);
    }
}
