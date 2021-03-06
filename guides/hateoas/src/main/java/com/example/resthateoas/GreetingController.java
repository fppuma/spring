package com.example.resthateoas;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class GreetingController {
	private static final String TEMPLATE = "Hello, %s!";

	@RequestMapping("/greeting")
	public HttpEntity<GreetingModel> getGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		GreetingModel greetingModel = new GreetingModel(String.format(TEMPLATE, name));
		greetingModel.add(linkTo(methodOn(GreetingController.class).getGreeting(name)).withSelfRel());

		return new ResponseEntity<>(greetingModel, HttpStatus.OK);
	}
}
