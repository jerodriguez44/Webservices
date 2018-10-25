package com.gA.gAAcademy.jerodriguez.webservices.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gA.gAAcademy.jerodriguez.webservices.webservices.entity.Topic;
import com.gA.gAAcademy.jerodriguez.webservices.webservices.respository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	public Topic createTopic(Topic inputRepository) {
		return topicRepository.save(inputRepository);
	}

	public List<Topic> getAll() {
		
		return topicRepository.findAll() ;
				
	}

	public Topic getId(int id) {
		
		return topicRepository.findById(id).get(); 
	}

	public Topic updateTopic(int id, Topic updateTopic) {
		Topic toUpdateTopic = topicRepository.findById(id).get();
		if (updateTopic.getAuthor()>0)
		
			toUpdateTopic.setAuthor(updateTopic.getAuthor());
		if(updateTopic.getTitle()!=null)
		  toUpdateTopic.setTitle(updateTopic.getTitle());
		if(updateTopic.getDescription()!=null)
		    toUpdateTopic.setDescription(updateTopic.getDescription());
		toUpdateTopic = topicRepository.save(toUpdateTopic);
		
		
		return toUpdateTopic ;
	

	
		
	}
	
	
	
	
}

