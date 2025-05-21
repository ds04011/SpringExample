package com.ds04011.SpringExample.database.repository;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ds04011.SpringExample.database.domain.UsedGoods;


@Mapper
public interface UsedGoodsRepository {
	

//	import org.apache.ibatis.annotations.Mapper;
	// db 관련 쿼리 수행 및 관련 처리 
	
	// 테이블의 모든행 조회 
	public List<UsedGoods> selectUsedGoodsList();
		//스프링에서는 쿼리 수행을 프레임 워크로 진행한다. 
		// 프레임워크 mybatis 사용법
		// 서블렛에서 하던거를 얘가 해주는 것.
	// 여기서 그냥 메서드 선언만 하고 --> mybatis 에 필요한 내용 추가해주면서 연동시키고,
	// 그러면 mybatis 가 실질적인 코드를 수행, 
		
		
	
	

}
