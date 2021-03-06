package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/ping")
	public String ping() {
		return "pong" + ( System.getenv("HOSTNAME") != null ? " " + System.getenv("HOSTNAME") : "" ).trim();
	}
}
