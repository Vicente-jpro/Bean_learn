package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

	@Autowired
	@Qualifier("simple_message_config")
	private String messageFromMyConfiguration;
	
	@GetMapping("/hello")
	public String hello() {
		return messageFromMyConfiguration;
	}
}
