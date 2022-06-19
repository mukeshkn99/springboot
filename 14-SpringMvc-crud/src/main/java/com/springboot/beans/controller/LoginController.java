package com.springboot.beans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.beans.binding.Loginform;
import com.springboot.beans.service.UserManageService;

@Controller
public class LoginController {

	@Autowired
	private UserManageService userservice;
	
	@GetMapping("/login")
	public String loginuser(Model model) {
		Loginform reg=new Loginform();
		model.addAttribute("user",reg);
		return "login";
	}
	@PostMapping("/loginuser")
	public String loginsub(@ModelAttribute("reg") Loginform login,Model model) {
		String loginform = userservice.loginform(login);
		model.addAttribute("success", "login success");
		return "login";
	}
	
}
