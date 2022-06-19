package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.user;

@Repository
public interface userinterface extends CrudRepository<user,Integer> {

}
