package com.springboot.beans.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.models.user;

@Repository
public interface userrepository extends CrudRepository<user,Integer> {
 user findByname(String name);

user findBynameandaddress(String name,String address);

}
