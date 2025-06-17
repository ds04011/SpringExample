package com.ds04011.SpringExample.jpa;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringExample.jpa.domain.Student;
import com.ds04011.SpringExample.jpa.repository.StudentRepository;
import com.ds04011.SpringExample.jpa.service.StudentService;

@Controller
@RequestMapping("/jpa/student")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentRepository studentRepository;// 임의 추가, 리포지토리만 테스트할꺼라 원랜 ㄴㄴ
	
	
	// 저장 기능 
	@GetMapping("/create")
	@ResponseBody
	public Student createStudent() {
		 
		Student st1 = studentService.addStudent("eri", "010-1111-1111", "eri@gmail.com", "singer");
		
		return st1;
		// 실행 후 콘솔창 보면 JPA 가 알아서 만든 인서트 쿼리문이 보인다.
	}
	
	
	@GetMapping("/find")
	@ResponseBody
	public List<Student> findAll(){
		
		List<Student> stList = null;
		
//		stList = studentRepository.findAllByOrderByIdDesc();
		
		stList = studentRepository.findByDreamJobQuery("모델");
		
		
		return stList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/jpa/lombok")
	@ResponseBody
	public Student lombokTest() {
		
		Student st1 = new Student(4, "kim", "010-1234-1234", "Kim@gmail.com", "programer", LocalDateTime.now(), LocalDateTime.now());
		st1.setDreamJob("pro");

		// 빌더 패턴
		// Student.builder().name("kim").dreamJob("progm").~~ 이런식으로 쭉 나열해서 객체 생성가능

		return st1;
	}
	
}
