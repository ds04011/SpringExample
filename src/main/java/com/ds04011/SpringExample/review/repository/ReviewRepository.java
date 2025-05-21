package com.ds04011.SpringExample.review.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringExample.review.domain.Review;

@Mapper
public interface ReviewRepository {
	
	//전달받은 id 
	public Review selectReview(@Param("id") int id);
	
}
