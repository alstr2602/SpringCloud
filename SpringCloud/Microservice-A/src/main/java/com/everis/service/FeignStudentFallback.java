package com.everis.service;

import java.util.Collections;
import java.util.List;

import com.everis.model.Student;

public class FeignStudentFallback implements IStudentFeignService {

	@Override
	public List<Student> getStudents() {
		return Collections.emptyList();
	}

	@Override
	public Student listForId(Integer id) {
		//Student student= new Student();
		//student.setStudentId((int) -1L);
		//student.setFirstName("Hola ");
		return null;
	}

}
