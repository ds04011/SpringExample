package com.ds04011.SpringExample.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@GetMapping("/ajax/ex01")
	public String ex01() {
		
		return "ajax/ex01";
	}
	
	
	// response 에 데이터(Json)가 담기는 페이지 == API
	// 그 반대로 화면을 구성하는 것, html 을 리턴하는 것 == View
	// 응답에 데이터만 포함시키는 형태, 데이터는 JSON 
	@ResponseBody
	@GetMapping("/ajax/person")
	public Map<String, Object> personInfo(@RequestParam("name") String name
			, @RequestParam("birth") String birth
			) {
		
		int age = 2025 - Integer.parseInt(birth.substring(0, 4));
		
		// 우리는 정보만 담아서 보내고 싶어, html 을 응답으로 보내주면 새로고침이 발생한다.
		// 그러기위해서 모델을 사용하는게 아니라 
		// JSON  규격으로 정보만을 담아서 보내는 것. 
		// {"name":"kim", "age":32} 뭐 이런식으로 
		
//		model.addAttribute("name" , name);
//		model.addAttribute("birth", birth);
		
		Map<String, Object> personMap = new HashMap<>();
		personMap.put("name", name);
		personMap.put("age", age);
		
		
		// 이렇게 보내면 json 형태로 바꿔서 읽어서 내보냄 , 여기서 자바스크립트 까지 더해서 
		// 브라우저가 알아서 하는게 아니라 매뉴얼 하게 하는것. 
		return personMap;
		
	}
	

}
