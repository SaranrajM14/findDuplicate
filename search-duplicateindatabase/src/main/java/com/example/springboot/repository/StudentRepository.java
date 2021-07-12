package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	List<Student> findByStudentName(String name);

}
