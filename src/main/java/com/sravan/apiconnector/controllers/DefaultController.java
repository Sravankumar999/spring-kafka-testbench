package com.sravan.apiconnector.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	
	@GetMapping("/")
	public String rootMapping() {
		return "Hello";
	}
}
