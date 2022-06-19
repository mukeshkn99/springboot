package com.springboot.beans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.beans.models.student;

@Controller
public class studentcontroller {

	@RequestMapping("/studentinfo")
	public String studentdata(Model model) {
		model.addAttribute("student", model);
		return "registration";
		
	}
	@PostMapping("/register")
	public String savedata(student s,Model m) {
		m.addAttribute("student", s);
		return "regsuc";
		
	}
}
