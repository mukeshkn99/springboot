package com.springboot.beans.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.models.student;

@Repository
public interface studentrepository extends CrudRepository<student,Integer>{

}
