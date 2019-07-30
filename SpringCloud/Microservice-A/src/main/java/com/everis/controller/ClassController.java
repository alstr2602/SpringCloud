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

import com.everis.model.Class;
import com.everis.service.IClassService;

@RestController
@RequestMapping("/classes")
public class ClassController {
	
	@Autowired
	private IClassService service;

	@GetMapping
	public List<Class> list() {
		return service.list();
	}

	@GetMapping(value = "/{id}")
	public Class listForId(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public Class create(@RequestBody Class cla) {
		return service.create(cla);
	}

	@PutMapping
	public Class update(@RequestBody Class cla) {
		return service.create(cla);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		Class cla = service.read(id);
	}

}
