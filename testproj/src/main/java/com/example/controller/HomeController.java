package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class HomeController {
	
	@RequestMapping("hello")
	public String helloWorld(){
		return "Hello";
	}

}
