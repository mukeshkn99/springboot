package com.springboot.beans.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.beans.binding.Regform;
import com.springboot.beans.service.UserManageService;

@Controller
public class RegController {

	@Autowired
	private UserManageService userservice;
	
	
	@GetMapping("/register")
	public String loginuser(Model model) {
		Regform reg=new Regform();
		model.addAttribute("user",reg);
		return "register";
	}
	@PostMapping("/adduser")
	public String registration(@ModelAttribute("reg") Regform reg,Model model) {
		String signup = userservice.signup(reg);
		model.addAttribute("success", "user reg success");
		return "regsuccess";
	}
	@GetMapping("/regsuccess")
	public String regdetls() {
		return "regsuccess";
	}
}
