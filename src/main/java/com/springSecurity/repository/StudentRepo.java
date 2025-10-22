package com.springSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springSecurity.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
 public  Student findByEmail(String email);
}
