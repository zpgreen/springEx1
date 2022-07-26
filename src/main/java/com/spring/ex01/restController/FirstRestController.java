package com.spring.ex01.restController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
	@RequestMapping("/creative")
	public Map<String,String> testHashMap(){
		System.out.println("creative on");
		Map<String,String> members = new HashMap<>();
		members.put("id", "ickang");
		members.put("address", "seoul");
		return members;
	}
}
