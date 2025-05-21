package com.ds04011.SpringExample.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringExample.database.domain.UsedGoods;
import com.ds04011.SpringExample.database.service.UsedGoodsService;

//request, response work, 
@Controller
public class UsedGoodsController {
	
	@Autowired
	private UsedGoodsService usedGoodsService; 
	
	// putting all info's about used goods into response
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> usedGoodsList() {
		
		//getting data from db, about `usedgoods` table
		// 여기서 서비스 객체를 선언 후, 그 메서드를 이용해서 db 정보를 가지고 오는 것. 
		// 정보를 얻어오는건 컨트롤러의 역할이 아니다. 
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		// json 형태로 리스트 리턴해주기 위해서 responsebody 로 설정
		// 원래 서블렛에서는 컨텐트 타입 , 정보 문자열 변환 해서 리턴해야하던걸 어노테이션 하나로 딸깍
		return usedGoodsList;
	}
	
}
