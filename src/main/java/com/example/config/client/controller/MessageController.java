package com.example.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Value("${message:hello}")
	private String message;

	@GetMapping("/hello")
	private String getMessage() {
		return message;
	}
}
