package com.springboot.beans.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.models.product;

@Repository
public interface productrepository extends CrudRepository<product,Integer> {

}
