package com.springboot.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackRest {

	@Autowired
	private FeedbackService service;
	
	@PostMapping("/feedback")
	public String feedbackForm(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("feedback") String feedback) {
		System.out.println("out coming");
		Feedback data = new Feedback(name,email,feedback);
		System.out.println("coming");
		boolean details = service.addFeedback(data);
		if(details) {
			return "Feedback added succesfully";
		}
		else {
			return"Unable to add the feedback";
		}
	}
}
