package com.springboot.beans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.beans.models.student;
import com.springboot.beans.service.studentservice;

@RestController
public class studentcontroller {

	@Autowired
	private studentservice service;
	
	@PostMapping(value="/createstudent",produces={"application/json","application/xml"},consumes= {"application/json","application/xml"})
	public student save(@RequestBody student stu) {
		return service.savedetails(stu);
	}
	
	@GetMapping(value="/getstudent/{id}")
	public student findstid(@PathVariable("id") int id) throws Exception {
		return service.findbyid(id);
	}
	
	@GetMapping(value="/getall")
	public Iterable<student> findall() {
		return service.findall();
	}
	@DeleteMapping(value="/delete/{id}")
	public student deletest(@PathVariable("id") int id) throws Exception {
		return service.deleteid(id);
	}
	@PutMapping(value="/update/{id}")
	public student updatest(@PathVariable("id") int id,@RequestBody student stu) throws Exception {
		return service.updateetails(id, stu);
	}
}
