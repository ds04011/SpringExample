package com.ds04011.SpringExample.jpa;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringExample.jpa.domain.Student;
import com.ds04011.SpringExample.jpa.service.StudentService;

@Controller
@RequestMapping("/jpa/student")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	// 저장 기능 
	@GetMapping("/create")
	@ResponseBody
	public Student createStudent() {
		 
		Student st1 = studentService.addStudent("eri", "010-1111-1111", "eri@gmail.com", "singer");
		
		return st1;
		// 실행 후 콘솔창 보면 JPA 가 알아서 만든 인서트 쿼리문이 보인다.
	}
	
	
	// 수정기능
	
	public updateStudent(int id, String dreamJob) {
		
		// 1. 수정대상 행 조회, 2. 조회 결과 객체 가져오기 3. 객체에 수정사항적용 4. 수정된 객체 저장
		
		
		
		
		
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
