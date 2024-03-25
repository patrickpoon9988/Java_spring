package com.example.firstspring.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspring.model.RefEventStatus;
import com.example.firstspring.model.UUID;
import com.example.firstspring.repository.RefEventStatusRepository;
import com.example.firstspring.repository.UUIDRepository;

@RestController
@CrossOrigin
public class RestfulController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private RefEventStatusRepository refEventStatusRepository;

	@Autowired
	private UUIDRepository uuidRepository;

	public record Greeting(long id, String content) { }

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello World";
	}

	@GetMapping("/status")
	public RefEventStatus getStatus() {
		return refEventStatusRepository.findById((long) 6).orElse(new RefEventStatus(){ });
	}

	@PostMapping("/userInsert")
	public String userInsert(@RequestParam String uuid) {
		UUID obj = new UUID();
		obj.setUUID(uuid);
		try {
			uuidRepository.save(obj);
			return "insert successfully";
		} catch(Exception e) {
			return "failed to insert";
		}
	}
}