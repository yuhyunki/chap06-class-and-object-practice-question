package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

	public static void main(String[] args) {

		MemberDTO member = new MemberDTO();
		
		//getter 사용해 필드 초기값 확인
		System.out.println("id : " + member.getId());
		System.out.println("pwd : " + member.getPwd());
		System.out.println("name : " + member.getName());
		System.out.println("age : " + member.getAge());
		System.out.println("gender : " + member.getGender());
		System.out.println("phone : " + member.getPhone());
		System.out.println("email : " + member.getEmail());
		
		//setter 사용해 필드값 변경
		member.setId("user01");
		member.setPwd("pass01");
		member.setName("홍길동");
		member.setAge(20);
		member.setGender('M');
		member.setPhone("010-1234-5678");
		member.setEmail("hong123@greedy.com");
		
		//getter 사용해 변경된 값 확인
		System.out.println("변경 후 id : " + member.getId());
		System.out.println("변경 후 pwd : " + member.getPwd());
		System.out.println("변경 후 name : " + member.getName());
		System.out.println("변경 후 age : " + member.getAge());
		System.out.println("변경 후 gender : " + member.getGender());
		System.out.println("변경 후 phone : " + member.getPhone());
		System.out.println("변경 후 email : " + member.getEmail());
		
	}

}
