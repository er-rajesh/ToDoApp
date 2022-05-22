package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		String str="home";
		System.out.println("/home in controller");
		model.addAttribute("page", str);
		return str;
	}

	public String add(Model model) {
		String str ="add";
		System.out.println("/add in controller");
		model.addAttribute("page",str);
		return str;
	}

}
