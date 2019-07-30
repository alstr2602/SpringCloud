package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Subject;

public interface ISubjectDAO extends JpaRepository<Subject, Integer> {

}
