package com.ds04011.SpringExample.jpa.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  						// 이게 JPA 가 인식할 수 있도록 이게 테이블 관련 엔티티 정보야  
@Table(name="`new_student`")  	// 이 테이블이랑 연관되어있어 
@Builder  						// 빌더 패턴을 통해 객체를 다룰 수 있도록 해준다. 
@Getter
@Setter
@AllArgsConstructor				// 모든 속성 다 받는 생성자
@NoArgsConstructor 				// 기본생성자
public class Student {
	
	@Id // 이거 아이디임 
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 프라이머리 키 라는 것. 
	private int id;
	
	private String name;
	private String phoneNumber;
	private String email;
	private String dreamJob;
	
	@CreationTimestamp  		// 생성 시 현재 시간 자동 완성 
	private LocalDateTime createdAt;
	
	@UpdateTimestamp			// 수정 시 현재 시간 자동 완성 
	private LocalDateTime updatedAt;
	
	
	
	
}
