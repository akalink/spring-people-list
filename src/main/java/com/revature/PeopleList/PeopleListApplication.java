package com.revature.PeopleList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PeopleListApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleListApplication.class, args);
	}

}
