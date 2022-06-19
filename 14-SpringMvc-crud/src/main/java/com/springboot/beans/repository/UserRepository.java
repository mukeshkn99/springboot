package com.springboot.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.models.UserDtlsEntity;

@Repository
public interface UserRepository extends JpaRepository<UserDtlsEntity,Integer> {
	
public UserDtlsEntity findByEmailAndPassword(String email,String password);

public UserDtlsEntity findByEmail(String email);

}
