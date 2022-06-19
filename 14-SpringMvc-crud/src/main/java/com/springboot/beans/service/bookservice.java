package com.springboot.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.beans.models.Book;





@Service
public interface bookservice {
String insert(Book book);
List<Book> getallbook();
Book getbookid(int bookid);
void deletecontact(int bookid);

}
