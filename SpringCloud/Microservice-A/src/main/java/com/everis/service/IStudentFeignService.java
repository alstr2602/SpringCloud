package com.everis.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.model.Student;

@FeignClient(name= "micro-b", fallback = FeignStudentFallback.class)
public interface IStudentFeignService {
	
	@GetMapping("/students")
	List<Student> getStudents();
	//
	@GetMapping("/students/{id}")
	Student listForId(@PathVariable("id") Integer id);
}
