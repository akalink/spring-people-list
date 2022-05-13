package com.revature.PeopleList.dto;

import com.revature.PeopleList.model.Ethnicity;
import com.revature.PeopleList.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private int id;
    private String fullName;
    private int age;
    private Gender gender;
    private Ethnicity ethnicity;
}
