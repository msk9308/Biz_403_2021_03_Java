package com.callor.apps.service;

public class ScoreServiceV2 extends ScoreServiceV1 {
	//for(int i = 0)
	//int members = 5
	//method의 괄호() 안에 선언된 변수
	//매개변수, parameter 라고 한다
	public ScoreServiceV2(int members) {
		intKor = new int[ members ];
		intEng = new int[10];
		intMath = new int[10];
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균\t");
		System.out.println("==========================================================");
	}

	
}
