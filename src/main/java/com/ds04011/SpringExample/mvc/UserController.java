package com.ds04011.SpringExample.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ds04011.SpringExample.mvc.domain.User;
import com.ds04011.SpringExample.mvc.service.UserService;

@Controller
@RequestMapping("/mvc")
public class UserController {
	
	// 최근 등록한 사용자 정보를 html 로 response 에 담자.
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/info")
	public String lastUserInfo(Model model) {
		
		User user1 = userService.getLastUser();
		model.addAttribute("title", "가장 최근 등록된 유저");
		model.addAttribute("result", user1);

		
		return "mvc/userInfo";
	}
	
	@GetMapping("/user/addpage")
	public String userCreate() {
		
		return "mvc/useradd";
	}
	
	@PostMapping("/user/add")
	public String createUser(@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("email") String email
			, @RequestParam("introduce") String introduce
			, Model model) {
	
		User user = new User();          // 이건 힙메모리 에 생성 후, 거기에 값 채운것
		user.setName(name);
		user.setYyyymmdd(birthday);
		user.setEmail(email);
		user.setIntroduce(introduce);
		
		// addUser 또한 객체를 받아서 저장하는 느낌으로 
		userService.addUser(user);
		//위에서는 id 값은 없었지, 근데 xml 의 
		//useGeneratedKeys="true" keyProperty="id"
		// 으로 인해 메서드를 거친 이후 id 값 까지 가지고 있는 user 가 됨.
		// 즉 메서드 사용 이후 의 user 는 모든 값을 가지고 있음.
		// 그래서 이 상태로 model 로 담아서 보내면, 그 객체의 id 값을 걱정 없이 사용 가능.
		model.addAttribute("title", "가장 최근 등록된 유저");
		model.addAttribute("result", user);
		
		// 그래서 이제 리다이렉트 가 아닌, 모델을 품고 userinfo 페이지로 가져가서 방금 추가한
		// 그 객체를 볼 수 있게 되는 것.
		return "/mvc/userinfo";
	}

}
