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
	
	public int addReview(int storeId, 
			String menu, 
			String userName, 
			double point, 
			String review) {
		
		int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
		return count;
	}
	
	//review 객체로 저장하기 
	public int addReviewByObject(Review review) {
		
		int count = reviewRepository.insertReviewByObject(review);
		return count;
	}
}
