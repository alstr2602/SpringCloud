package com.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.ISubjectDAO;
import com.everis.model.Subject;
import com.everis.service.ISubjectService;

@Service
public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	private ISubjectDAO dao;
	
	@Override
	public Subject create(Subject obj) {
		return dao.save(obj);
	}

	@Override
	public Subject update(Subject obj) {
		return dao.save(obj);
	}

	@Override
	public List<Subject> list() {
		return dao.findAll();
	}

	@Override
	public Subject read(Integer id) {
		Optional<Subject> op = dao.findById(id);
		return op.isPresent() ? op.get() : new Subject();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}
	
	



}
