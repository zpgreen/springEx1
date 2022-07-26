package com.spring.ex01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FistController {
	@GetMapping("/hi")
	public String greeting(Model model){
		model.addAttribute("username", "철철");
		return "greetings";
	}
	@GetMapping("/bye")
	public String byeAction(Model model) {
		model.addAttribute("nickname", "inchul");
		return "bye";
	}
	
}
