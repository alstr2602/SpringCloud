package com.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.ITeacherDAO;
import com.everis.model.Teacher;
import com.everis.service.ITeacherService;

@Service
public class TeacherServiceImpl implements ITeacherService {

	@Autowired
	private ITeacherDAO dao;
	
	@Override
	public Teacher create(Teacher obj) {
		return dao.save(obj);
	}

	@Override
	public Teacher update(Teacher obj) {
		return dao.save(obj);
	}

	@Override
	public List<Teacher> list() {
		return dao.findAll();
	}

	@Override
	public Teacher read(Integer id) {
		Optional<Teacher> op = dao.findById(id);
		return op.isPresent() ? op.get() : new Teacher();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);

	}

}
