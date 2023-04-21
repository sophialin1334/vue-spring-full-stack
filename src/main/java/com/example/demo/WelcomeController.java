package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/api/messages")
public class WelcomeController {
	
	//Auto wiring
		@Autowired
		private WelcomeService service;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
	@GetMapping("/hello")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }
}


@Component
class WelcomeService {

	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning updated";
	}
}