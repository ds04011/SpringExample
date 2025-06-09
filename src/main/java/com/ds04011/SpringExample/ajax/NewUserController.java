package com.ds04011.SpringExample.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringExample.mvc.domain.User;
import com.ds04011.SpringExample.mvc.service.UserService;

@Controller
public class NewUserController {
	
	@Autowired
	private UserService userSerivce;
	
	@ResponseBody
	@PostMapping("/newuser/add")
	public Map<String, String> createUser (@RequestParam("name") String name 
			, @RequestParam("birthday") String birthday
			, @RequestParam("email") String email
			, @RequestParam("introduce") String introduce) {
		
		User user1 = new User();
		user1.setEmail(email);
		user1.setIntroduce(introduce);
		user1.setName(name);
		user1.setYyyymmdd(birthday);
		
		int count = userSerivce.addUser(user1);
		String result ="fail";
		//success 	{"result": "success"}
		// fail 	{"result": "fail"}
		Map<String, String> map1 = new HashMap<>();
		if(count == 1) {
			result="success";
		}
		map1.put("result", result);
		
		
		
		return map1;
	}
	
	
	// 입력화면 view 
	@GetMapping("/newuser/input")
	public String inputUser() {
		
		return "ajax/input";
	}
	
	
}
