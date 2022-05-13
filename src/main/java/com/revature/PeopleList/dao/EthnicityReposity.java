package com.revature.PeopleList.dao;

import com.revature.PeopleList.model.Ethnicity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EthnicityReposity extends JpaRepository<Ethnicity, Integer> {
}
