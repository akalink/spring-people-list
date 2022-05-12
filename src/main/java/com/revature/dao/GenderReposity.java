package com.revature.dao;

import com.revature.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderReposity extends JpaRepository<Gender, Integer> {
}