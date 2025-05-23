package com.ds04011.SpringExample.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ds04011.SpringExample.mvc.domain.User;
import com.ds04011.SpringExample.mvc.service.UserService;

@Controller
public class UserController {
	
	// 최근 등록한 사용자 정보를 html 로 response 에 담자.
	@Autowired
	private UserService userService;
	
	@RequestMapping("/mvc/user/info")
	public String lastUserInfo(Model model) {
		
		User user1 = userService.getLastUser();
		model.addAttribute("title", "가장 최근 등록된 유저");
		model.addAttribute("result", user1);

		
		return "mvc/userInfo";
	}

}
