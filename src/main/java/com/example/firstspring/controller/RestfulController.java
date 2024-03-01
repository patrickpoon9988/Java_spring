package com.example.firstspring.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspring.model.RefEventStatus;
import com.example.firstspring.repository.RefEventStatusRepository;

@RestController
public class RestfulController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private RefEventStatusRepository refEventStatusRepository;

	public record Greeting(long id, String content) { }

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello World";
	}

	@GetMapping("/status")
	public RefEventStatus getStatus() {
		return refEventStatusRepository.findById((long) 3).orElse(new RefEventStatus(){ });
	}
}