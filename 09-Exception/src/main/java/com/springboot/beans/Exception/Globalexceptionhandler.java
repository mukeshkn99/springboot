package com.springboot.beans.Exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Globalexceptionhandler extends ResponseEntityExceptionHandler  {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<errordetails> handleException(ProductNotFoundException ex) {
		List<String> details = new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		errordetails error = new errordetails("client error", new Date(), details);
		return new ResponseEntity<errordetails>(error, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<errordetails> handleException(Exception ex) {
		List<String> details = new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		errordetails error = new errordetails("server error", new Date(), details);
		return new ResponseEntity<errordetails>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> details = new ArrayList<String>();
		for(ObjectError error:ex.getBindingResult().getAllErrors()) {
			details.add(error.getDefaultMessage());
		}
		
		
		errordetails error = new errordetails("validation error", new Date(), details);
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

			}
	
	 
	 }
