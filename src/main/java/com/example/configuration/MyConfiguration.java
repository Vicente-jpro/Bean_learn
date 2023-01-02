package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean( name = "simple_message_config")
	public String simpleMessage() {
		return "This is a message from MyConfiguration class";
	}

}
