package com.ds04011.SpringExample.lifecycle;

public class Person {

	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	// 이 상태에서, person 객체를 호출하면, 메세지컨버터가 에러냄
	// 메세지 컨버터는 객체를 json 문자열로 구성하려고 함
	// 근데 게터 없어서 메세지 컨버터가 이 객체를 문자열로 가져가질 못함,
	// 게터 필요함
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : "  + age;
	}
}
