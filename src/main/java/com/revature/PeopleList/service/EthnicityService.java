package com.revature.PeopleList.service;

import com.revature.PeopleList.dao.EthnicityReposity;
import com.revature.PeopleList.model.Ethnicity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EthnicityService {

    @Autowired
    EthnicityReposity ethnicityReposity;

    public Ethnicity getEthnicity(int id){
        Optional<Ethnicity> optional = ethnicityReposity.findById(id);
        if(optional.isPresent()){
            return optional.get();
        } else {
            return null;
        }
    }

    public List<Ethnicity> getAllEthnicity(){
        return ethnicityReposity.findAll();
    }
}
