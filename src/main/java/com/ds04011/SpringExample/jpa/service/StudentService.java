package com.ds04011.SpringExample.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringExample.jpa.domain.Student;
import com.ds04011.SpringExample.jpa.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(String name, String phoneNumber, String email, String dreamJob){
		
		Student st1 = Student.builder()
		.name(name)
		.phoneNumber(phoneNumber)
		.email(email)
		.dreamJob(dreamJob)
		.build();
		
		
		Student result = studentRepository.save(st1);
		
		return result;
	}
	
	public Student updateStudent(int id, String dreamJob) {
		
		// 1. 수정대상 행 조회, 2. 조회 결과 객체 가져오기 3. 객체에 수정사항적용 4. 수정된 객체 저장
		
		Optional<Student> st1 =  studentRepository.findById(id);
		// optional 이란, null 일 수도 있는 객체를 감싸놓은 클래스. 
		// null 처리에 필요한 기능들이 담겨있는 클래스, null pointer exception 을 회피하기 위한 장치
		// null 일 수도 있는 객체를 리턴하는 메서드 에서 리턴타입으로 많이 활용
		
		Student student = st1.orElse(null);
		
		if(st1.isPresent()) {
			// not null
			
			student.setDreamJob(dreamJob);
			studentRepository.save(student);
		}
		return student;
	}

}
