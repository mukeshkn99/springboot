package com.springboot.beans.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS_DETLS")
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="BOOK_ID")
private int bookid;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}

public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

@Column(name="BOOK_NAME")
private String bookname;
@Column(name="BOOK_AUTHOR")
private String authorname;
@Column(name="BOOK_PRICE")
private Double price;
}
