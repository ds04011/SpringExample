package com.ds04011.SpringExample.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	
	@GetMapping("/thymeleaf/ex01")
	public String ex01() {
		
		return "thymeleaf/ex01";
	}
	
	@GetMapping("/thymeleaf/test01")
	public String test01() {
		return "thymeleaf/text01";
	}
	
	@GetMapping("/thymeleaf/test02")
	public String test02(Model model) {
		
		List<String> musicRanking = new ArrayList<>();
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");
		
		model.addAttribute("result", musicRanking);
		
		
		return "thymeleaf/test02";
	}

}
