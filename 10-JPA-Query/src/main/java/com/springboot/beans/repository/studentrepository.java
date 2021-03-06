package com.springboot.beans.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.models.student;
@Repository
public interface studentrepository extends CrudRepository<student,Integer>{

	
	
	  @Query(value="select u from student u") 
	  List<student> fetchalldetails();
	  
	  @Query(value="select u.name=:name from student u") 
	  List<student>fetchallusername(String name);
	  
	  @Query(
	  value="select u from student u where u.name=:name and u.password=:password")
	  List<student> fetchallnampassword(String name,int password);
	 
	 @Modifying
	 @Query(value="update  student u set u.name=:name where u.password=:password")
	  @Transactional 
	  int updatenameforpassword(String name,int password);
	 	
}
