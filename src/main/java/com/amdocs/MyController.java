package com.amdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String Home() {
		return "Welcome to jenkin demo controller";
	}
	@GetMapping("/home")
	public String Home2() {
		return "Welcome to jenkin demo2 controller";
	}
	@GetMapping("/home3")
	public String Home3() {
		return "Welcome to jenkin demo2 controller";
	}

}
