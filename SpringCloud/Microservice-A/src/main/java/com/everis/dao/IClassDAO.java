package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.everis.model.Class;

public interface IClassDAO extends JpaRepository<Class, Integer> {

}
