package com.ds04011.SpringExample.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringExample.review.domain.Review;
import com.ds04011.SpringExample.review.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping("/review/id")
	@ResponseBody
	public Review getReview(@RequestParam("id") int id ) {
		//request Parameter 로 id 를 전달받는데, 위와 같은 방법으로,
		
		
		Review r1 = reviewService.getReview(id);
		return r1;
	}
}
