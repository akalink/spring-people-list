package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.GenderReposity;
import com.revature.PeopleList.model.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {

    @Autowired
    GenderReposity genderReposity;

    public Gender getGender(int id){
        return genderReposity.getById(id);
    }
}
