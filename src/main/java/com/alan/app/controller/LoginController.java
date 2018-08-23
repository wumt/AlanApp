package com.alan.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "艾伦");
		return "index";
	}
}
