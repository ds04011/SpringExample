package com.ds04011.SpringExample.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	
	//html 을 responsebody 에 담아보자
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/1")
	public String htmlResponse() {
		return ""
				+ "<html>\n"
				+ "		<head><title>Spring example</title></head>\n"
				+ "		<body>\n"
				+ "			<h2>Spring html response</h2>\n"
				+ "		</body>\n"
				+ "</html>";
	}
	
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	public Map<String, Integer> mapResponse() {
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("apple", 1500);
		fruitMap.put("nanaba", 1000);
		fruitMap.put("mango", 6000);
		
		return fruitMap;
		
	}
	
	// 따로 컨텐트 타입을 text/html 로 하지 않아도 메세지컨버터가 알아서 html 로 태그 해석
	
	
}
