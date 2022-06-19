package com.springboot.beans.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.beans.Exception.ProductNotFoundException;
import com.springboot.beans.models.product;
import com.springboot.beans.service.productservice;

@RestController
public class productcontroller {

	
	@Autowired
	private productservice proservice;
	
	@GetMapping(value="/hello")
	public String savedata() {
		return "call";
	}
	
	@PostMapping(value="/createproduct",produces={"application/json","application/xml"},consumes={"application/json","application/xml"})
	public ResponseEntity<product> saveproduct(@RequestBody @Valid product pro) {
		product prod= proservice.saveproduct(pro);
		return new ResponseEntity<product>(prod,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/fetchallproduct")
	public Iterable<product> fetchalldetails() {
		return proservice.fetchallproducts();
	}
	
	@GetMapping(value="/fetchid/{id}")
	public product findproduct(@PathVariable("id")Integer id) throws ProductNotFoundException {
		return proservice.fetchproductbyid(id);
	}
	
	@DeleteMapping(value="/deleteid/{id}")
	public product deleteidproduct(@PathVariable("id")Integer id) throws Exception {
		return proservice.fetchdeletebyid(id);
	}
   @PutMapping(value="/updateinfo/{id}")
   public product updateproduct(@PathVariable("id")Integer id,@RequestBody product pro ) throws Exception {
	   return proservice.updateproducts(id, pro);
   }

}
