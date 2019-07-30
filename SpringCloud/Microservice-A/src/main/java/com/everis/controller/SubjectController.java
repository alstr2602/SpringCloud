package com.everis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.Subject;
import com.everis.service.ISubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	
	@Autowired
	private ISubjectService service;

	@GetMapping
	public List<Subject> list() {
		return service.list();
	}

	@GetMapping(value = "/{id}")
	public Subject listForId(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public Subject create(@RequestBody Subject sub) {
		return service.create(sub);
	}

	@PutMapping
	public Subject update(@RequestBody Subject sub) {
		return service.create(sub);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		Subject sub = service.read(id);
	}

}
