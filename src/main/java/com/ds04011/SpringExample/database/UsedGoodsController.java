package com.ds04011.SpringExample.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//request, response work, 
@Controller
public class UsedGoodsController {
	
	// putting all info's about used goods into response
	@RequestMapping("/db/usedgoods/list")
	public void usedGoodsList() {
		
		//getting data from db, about `usedgoods` table
		// 여기서 서비스 객체를 선언 후, 그 메서드를 이용해서 db 정보를 가지고 오는 것. 
		
	}
	
}
