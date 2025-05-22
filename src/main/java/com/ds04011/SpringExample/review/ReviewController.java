package com.ds04011.SpringExample.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringExample.review.domain.Review;
import com.ds04011.SpringExample.review.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping("/id")
	@ResponseBody
	public Review getReview(@RequestParam("id") int id ) {
		//request Parameter 로 id 를 전달받는데, 위와 같은 방법으로,
		
		
		Review r1 = reviewService.getReview(id);
		return r1;
	}
	
	// 리뷰 저장 기능 만들기
	@RequestMapping("/create")
	@ResponseBody
	public String createReview() {
		
		
		// 엔티티 클래스로 객체로 추가  
		Review review = new Review();
		review.setStoreId(4);
		review.setMenu("pizza");
		review.setUserName("yhw");
		review.setPoint(4.5);
		review.setReview("마마마맛있다다다요");
		int count= reviewService.addReviewByObject(review);

		// 직접 추가, 
		//int count = reviewService.addReview(4, "치즈피자", "yhw", 4.5, "맛있다요");
		
		
		
		return "실행결과 : " + count;
	}
}
