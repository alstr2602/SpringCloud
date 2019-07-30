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

import com.everis.model.Teacher;
import com.everis.service.ITeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private ITeacherService service;

	@GetMapping
	public List<Teacher> list() {
		return service.list();
	}

	@GetMapping(value = "/{id}")
	public Teacher listForId(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public Teacher create(@RequestBody Teacher tea) {
		return service.create(tea);
	}

	@PutMapping
	public Teacher update(@RequestBody Teacher tea) {
		return service.create(tea);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		Teacher tea = service.read(id);

	}
}
