package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.EthnicityReposity;
import com.revature.PeopleList.model.Ethnicity;
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
public class EthnicityServiceTest {

    @Mock
    private EthnicityReposity ethnicityReposity;

    @InjectMocks
    private EthnicityService ethnicityService;

    @Test
    public void getEthnicityByIdPositive(){
        Ethnicity ethnicity = new Ethnicity(1, "White");
        when(ethnicityReposity.findById(1)).thenReturn(Optional.of(ethnicity));
        Ethnicity actual = ethnicityService.getEthnicity(1);
        assertThat(actual).isEqualTo(ethnicity);
    }

    @Test
    public void getEthnicityByIdNegative(){
        Ethnicity ethnicity = new Ethnicity(1, "White");
        Ethnicity ethnicity1 = new Ethnicity(2, "Black");
        when(ethnicityReposity.findById(2)).thenReturn(Optional.of(ethnicity1));
        Ethnicity actual = ethnicityService.getEthnicity(2);
        assertThat(actual).isNotEqualTo(ethnicity);
    }

    @Test
    public void getAllEthnicity(){
        List<Ethnicity> ethnicityList = ethnicityService.getAllEthnicity();
        AssertionsForClassTypes.assertThat(ethnicityList).isNotNull();
    }
}
