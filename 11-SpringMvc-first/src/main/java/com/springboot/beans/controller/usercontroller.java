package com.springboot.beans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usercontroller {

	@RequestMapping("/welcome")
	public String display(Model model) {
		model.addAttribute("msg", "welcome to mvc");
		return "index";
	}
}
