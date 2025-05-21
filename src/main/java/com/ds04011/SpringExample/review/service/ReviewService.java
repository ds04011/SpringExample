package com.ds04011.SpringExample.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringExample.review.domain.Review;
import com.ds04011.SpringExample.review.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	//id 에 대한 정보, 
	public Review getReview(int id) {
		Review r1  = reviewRepository.selectReview(id);
		return r1;
	}
}
