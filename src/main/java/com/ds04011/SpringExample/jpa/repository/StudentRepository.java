package com.ds04011.SpringExample.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ds04011.SpringExample.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{ // 테이블명, id타입
	
		// 특별히 필요한 메서드가 있을때만 그 메서드 생성하러 오면 됨, 
	
	public List<Student> findAllByOrderByIdDesc();	

	public List<Student> findTop2ByOrderByIdDesc();
	
	public List<Student> findByName(String name);
	
	public List<Student> findByNameIn(List<String> nameList);
	
	public List<Student> findByEmailContaining(String email);
	
	public List<Student> findByIdBetweenOrderByIdDesc(int start, int end);
	
	
	@Query(value="select * From `new_student` Where `dreamJob` = :dreamJob", nativeQuery=true)
	public List<Student> findByDreamJobQuery(@Param("dreamJob") String dreamJob);

}
