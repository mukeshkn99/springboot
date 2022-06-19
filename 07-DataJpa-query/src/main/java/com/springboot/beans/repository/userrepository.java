package com.springboot.beans.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.models.user;

@Repository
public interface userrepository extends CrudRepository<user,Integer> {
 
	@Query(value="select u from user u")
	List<user> fetchalluserdetails();
	
	@Query(value="select u.name from user u")
	List<String> fetchusernames(String name);
	
	@Query(value="select u from user u where u.name=:name and u.address=:address")
	List<user> fetchallusernameandaddress(String name,String address);


	@Modifying
	@Query(value="update user u set u.name=:name where u.address=:address")
	@Transactional
	int updatedeatailsforname(String name,String address);
}
