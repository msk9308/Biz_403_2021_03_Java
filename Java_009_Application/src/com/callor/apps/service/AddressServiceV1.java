package com.callor.apps.service;

public class AddressServiceV1 {
	
	public void printAddress(String name , String email , String phone) {
		/*
		 * name,email,phone 3개의 매개변수를통해
		 * 문자열을 전달 발고 전달받은 문자열을 Console에 출력하기
		 */
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
	}//AddressVO 클래스를 매개변수로 받는 method
	public void printAddress(AddressVo adVO) {
		System.out.println(adV0.name);
		System.out.println(adV0.email);
		System.out.println(adV0.chain);
		System.out.println(adV0.address;
		System.out.println(adV0.cellPhone);
		
	}

}
