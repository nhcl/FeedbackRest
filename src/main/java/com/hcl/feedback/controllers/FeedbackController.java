package com.hcl.feedback.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.feedback.repository.FeedbackRepository;

import com.hcl.feedback.model.Feedback;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackRepository feedbackRepo; 
	
	@GetMapping("/")
	public String showServiceName() {
		return "Feedback";
	}
	
	@GetMapping("/feedback/{id}")
	public Feedback showFeedbackById(@PathVariable Integer id) {
		Optional<Feedback> fb = feedbackRepo.findById(id);
		if(fb.isPresent()) {
			return fb.get();
		}else {
			return null; //handle this
		}
	}

	@PostMapping("/submitFeedback")
	public Feedback addFeedback(@RequestBody Feedback newFeedback) {
		//errorhandling
		return feedbackRepo.save(newFeedback);
	}
}
