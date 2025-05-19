package com.ds04011.SpringExample.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lifecycle/ex02")
public class Ex02Controller {
	
	@RequestMapping("/1")
	public String thymeleafResponse() {
		//html file path return
		// src/main/resources/templates is omit
		// .html omit
		
		return "lifecycle/ex02";
	}
	
	
}
