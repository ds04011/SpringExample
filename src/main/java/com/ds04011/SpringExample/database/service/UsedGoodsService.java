package com.ds04011.SpringExample.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringExample.database.domain.UsedGoods;
import com.ds04011.SpringExample.database.repository.UsedGoodsRepository;

// business logic part
// data processing
// 정확한 흐름을 알아야 한다. 
@Service
public class UsedGoodsService {
	
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	
	//getting all used goods posts info's by method
	public List<UsedGoods> getUsedGoodsList() {
		// 테이블의 모든 행 조회 
		// 쿼리를 수행해야 하는데, 쿼리는 repository 의 역할이야 
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		return usedGoodsList ;
	}
	
	
}
