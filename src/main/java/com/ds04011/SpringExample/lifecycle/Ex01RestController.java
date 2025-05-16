package com.ds04011.SpringExample.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.http.HttpStatus;

@RestController  // responsebody + controller
@RequestMapping("/lifecycle/ex01")  // 페이지 내의 중복되는 url 담당,
public class Ex01RestController {

	// 직접 만든 클래스의 객체를 response 에 담는 페이지
	@RequestMapping("/3")
	public Person personResponse() {
		Person p1 = new Person("yhw", 28);
		return p1;
	}
	
	
	//status code 수정, 
	@RequestMapping("/4")
	public ResponseEntity<Person> statusResponse() {
		Person p1 = new Person("yhw", 28);
		
		ResponseEntity<Person> entity = new ResponseEntity<>(p1 , HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
		// 근데 이건 상태코드 를 조정한거라, 바디 부분, 즉 우리가 눈에 보이는 차이는 없음
		// 상태코드를 보러 들어가면 500 에러가 보일꺼다.
	}
	
}
