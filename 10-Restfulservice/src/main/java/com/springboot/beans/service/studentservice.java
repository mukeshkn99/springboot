package com.springboot.beans.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.beans.models.student;
import com.springboot.beans.repo.studentrepository;

@Service
public class studentservice {

	@Autowired
	private studentrepository repo;

public student savedetails(student stu) {
	return repo.save(stu);
}
public student findbyid(Integer id) throws Exception {
	return repo.findById(id).orElseThrow(()->new Exception("not valid"));
}

public Iterable<student> findall() {
	return repo.findAll();
}

public student deleteid(Integer id) throws Exception {
	student s=findbyid(id);
	if(s!=null) {
		 repo.delete(s);
	}
	return null;
}
public student updateetails(Integer id,student stu) throws Exception {
	student s=findbyid(id);
	if(s!=null) {
		s.setName(stu.getName());
		s.setMarks(stu.getMarks());
		return repo.save(stu);
	}
	return null;
}

}
