package com.example.firstspring.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public record Greeting(long id, String content) { }

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello World";
	}
}