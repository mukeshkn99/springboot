package com.springboot.beans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.beans.models.Book;
import com.springboot.beans.repository.bookrepository;

@Service
public class bookserviceimp implements bookservice {

	@Autowired
	private bookrepository repo;
	@Override
	public String insert(Book book) {
	repo.save(book);
		return "success";
	}

	@Override
	public List<Book> getallbook( ) {
		return repo.findAll();
	}

	@Override
	public Book getbookid(int bookid) {
		Optional<Book> find=repo.findById(bookid);
		if(find.isPresent()) {
         return find.get();
		}
		return null;
	}

	@Override
	public void deletecontact(int bookid) {
		repo.deleteById(bookid);
	}

}
