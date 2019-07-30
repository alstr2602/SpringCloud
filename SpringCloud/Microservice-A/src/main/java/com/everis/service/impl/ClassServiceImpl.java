package com.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.IClassDAO;
import com.everis.model.Class;
import com.everis.service.IClassService;

@Service
public class ClassServiceImpl implements IClassService{
	
	@Autowired
	private IClassDAO dao;

	@Override
	public Class create(Class obj) {
		return dao.save(obj);
	}

	@Override
	public Class update(Class obj) {
		return dao.save(obj);
	}

	@Override
	public List<Class> list() {
		return dao.findAll();
	}

	@Override
	public Class read(Integer id) {
		Optional<Class> op = dao.findById(id);
		return op.isPresent() ? op.get() : new Class();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);		
	}

}
