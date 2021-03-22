package com.callor.controller;

public class Array_02 {

	public static void main(String[] args) {
		
	//어떤값을 저장할 변수를 3개 이상 만들어야 된다
	int intKor1 = 0;
	int intKor2 = 0;
	int intKor3 = 0;
	
	//그러면 배열을 만든다
	int[] intKors = new int[3];
	
	//값저장
	//변수이름[위치주소] = 값
	//변수이름[첨자] = 깂
	intKors[0] = 100;
	intKors[1] = 90;
	intKors[2] = 88;
	//intKors[3] = 100;
	
	//값읽기
	//=intKors[위치주소]
	//=intKors[첨자]
	intKor = intKors[0];
	intKor = intKors[1];
	intKor = intKors[2];
	
	for(int inext = 0; index < 3; index ++) {
		System.out.println(intKor[index]);
	}
	
	}
}
