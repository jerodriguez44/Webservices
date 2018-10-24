package com.gA.gAAcademy.jerodriguez.webservices.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic_Controller 
	
	@Autowired 
	TopicService TopicService 
	
	
	@PostMapping("/topic")
	public Topic  createTopic( @RequestBody Topic )
	
	
	
	
	public Topic 
	
}
