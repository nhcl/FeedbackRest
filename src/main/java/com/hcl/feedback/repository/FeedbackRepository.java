package com.hcl.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import com.hcl.feedback.model.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}
