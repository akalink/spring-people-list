package com.revature.dao;

import com.revature.model.Ethnicity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EthnicityReposity extends JpaRepository<Ethnicity, Integer> {
}
