package com.revature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello") //localhost:8080/hello
@RestController
public class HelloController {
	
	@GetMapping
	public String hello() {
		//comment here
		return "What's up?";
	}
	
}
