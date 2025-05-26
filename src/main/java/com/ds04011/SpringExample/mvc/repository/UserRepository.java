package com.ds04011.SpringExample.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringExample.mvc.domain.User;

@Mapper
public interface UserRepository {
	
	public User selectLastUser();
	public int addUser(User user);
	
}
