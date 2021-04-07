package com.callor.service;

public class ScoreServiceV4 {
	protected InputServiceV2 inService;
	String[] subject = {"국어","영어","수학"};
	
	public ScoreServiceV4() {
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		Integer intKor = inService.inputValue("국어",0,100);
		
		
		
		
		int sum = intKor + intEng + intMath;
		float avg = (float)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
