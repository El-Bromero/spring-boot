package org.tekcamp.springtek.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tekcamp.springtek.api.services.GreetingService;


@RestController
@RequestMapping(path = "/greet")
public class GreetingController {

	@Autowired
	GreetingService greetingService;

	@GetMapping(path = {"","/english","/eng"})
	public String helloSpring() {
		return greetingService.greetEnglish();
	}

}
