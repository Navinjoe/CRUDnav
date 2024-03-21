package com.Basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Basic.entity.Student;

public interface repository extends JpaRepository <Student,Long>{
	

}
