package com.everis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.Student;
import com.everis.service.IStudentFeignService;

@RestController
public class StudentFeignController {
	
	@Autowired
	private IStudentFeignService feignService;
	
	@GetMapping("/students-classes")
	public List<Student> getStudents() {
		return feignService.getStudents();
	}
	//
	@GetMapping("/students-classes/{id}")
	public Student listForId(Integer id) {
		return feignService.listForId(id);
	}
	

}
