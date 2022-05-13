package com.revature.PeopleList.dao;

import com.revature.PeopleList.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderReposity extends JpaRepository<Gender, Integer> {
}
