package com.springboot.beans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class usercontroller {

	@RequestMapping("/welcome")
	public String display(@RequestParam("name")String name,Model model) {
		String output=name.concat("welcome to spring");
		model.addAttribute("msg",output);
		return "index";
	}
	
	@RequestMapping("/getmarks")
	public String getdetails(@RequestParam("name") String name,@RequestParam("marks") String marks,Model model) {
		String outputresult=name.concat("welcome to server").concat(marks).concat(" marks");
		model.addAttribute("msg", outputresult);
		return "index";
	}
}
