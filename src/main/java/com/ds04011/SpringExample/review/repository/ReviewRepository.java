package com.ds04011.SpringExample.review.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringExample.review.domain.Review;

@Mapper
public interface ReviewRepository {
	
	//전달받은 id 
	public Review selectReview(@Param("id") int id);
	
	public int insertReview(@Param("storeId") int storeId, 
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") double point, 
			@Param("review") String review);
	
	public int insertReviewByObject(Review review);
}
