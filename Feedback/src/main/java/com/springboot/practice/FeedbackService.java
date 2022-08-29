package com.springboot.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository repo;
	
	public boolean addFeedback(Feedback data) {
		System.out.println(data);
		repo.save(data);
		return true;
	}
}
