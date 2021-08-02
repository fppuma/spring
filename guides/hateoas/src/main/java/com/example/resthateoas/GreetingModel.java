package com.example.resthateoas;

import org.springframework.hateoas.RepresentationModel;

public class GreetingModel extends RepresentationModel<GreetingModel>{
	private final String content;

	public GreetingModel(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
