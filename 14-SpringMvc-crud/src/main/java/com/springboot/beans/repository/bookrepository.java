package com.springboot.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.beans.models.Book;

public interface bookrepository extends JpaRepository<Book,Integer> {

}
