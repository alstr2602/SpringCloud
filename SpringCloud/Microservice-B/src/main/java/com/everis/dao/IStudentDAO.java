package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.model.Student;

@Repository
public interface IStudentDAO extends JpaRepository<Student, Integer> {

}
