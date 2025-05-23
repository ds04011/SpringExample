package com.ds04011.SpringExample.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.ds04011.SpringExample.mvc.domain.User;

@Mapper
public interface UserRepository {
	
	public User selectLastUser();
	
}
