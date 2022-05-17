package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.GenderReposity;
import com.revature.PeopleList.model.Gender;
import com.revature.PeopleList.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService {

    @Autowired
    GenderReposity genderReposity;

    public Gender getGender(int id){
        Optional<Gender> optional = genderReposity.findById(id);
        if(optional.isPresent()){
            return optional.get();
        } else {
            return null;
        }

    }

    public List<Gender> getAllGender(){
        return genderReposity.findAll();
    }
}
