package com.ds04011.SpringExample.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds04011.SpringExample.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{ // 테이블명, id타입
	
		// 특별히 필요한 메서드가 있을때만 그 메서드 생성하러 오면 됨, 
	
	public List<Student> findAllByOrderByIdDesc();	

	public List<Student> findTop2ByOrderByIdDesc();
}
