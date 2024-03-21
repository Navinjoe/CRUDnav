package com.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Basic.entity.Student;
import com.Basic.repository.repository;

@SpringBootApplication
public class BasicApplication implements  CommandLineRunner {
    
	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}
    
	@Autowired
	private repository rep;
     
	
	@Override
	public void run(String... args) throws Exception {
		
	}
}
