package com.springboot.beans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.beans.models.Book;
import com.springboot.beans.service.bookservice;



@Controller
public class bookcontroller {
	@Autowired
	private bookservice service;

	@GetMapping(" ")
	public String welcome(){
		return "user";
	}
	
	@GetMapping("/bookinfo")
	public String loadbook(Model model) {
		Book book=new Book();
		model.addAttribute("book",book);
		return "createbook";
	}
	@PostMapping("/addbook")
	public String handlesubmit(@ModelAttribute("book")Book book,Model model) {
	   String insert = service.insert(book);
	    
		if(insert!=null) {
		model.addAttribute("success", "Book stored success");
		}
		else {
			return "failed";
		}
		return "viewbook";
	}
	@GetMapping("/viewbook")
	public String get(Model model) {
		List<Book> list = service.getallbook();
		model.addAttribute("book",list);
		return "viewbook";
	}
	@GetMapping("edit/id")
	public String getid(@PathVariable("id")Integer bookid,Model model) {
		 Book getbookid = service.getbookid(bookid);
		model.addAttribute("book",getbookid);
		return "update";
	}
	@PostMapping("/editbook")
	public String edit(@ModelAttribute("book")Book book,Model model) {
		String insert = service.insert(book);
		model.addAttribute("book", insert);
		return "viewbook";
	}
	@GetMapping("/delete/id")
	public String deleteid(@PathVariable("id")Integer bookid) {
		service.deletecontact(bookid);
		return "viewbook";
		
	}
	}