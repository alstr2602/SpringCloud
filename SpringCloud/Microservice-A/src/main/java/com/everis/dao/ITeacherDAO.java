package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Teacher;

public interface ITeacherDAO extends JpaRepository<Teacher, Integer> {

}
