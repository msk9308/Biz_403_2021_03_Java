package com.callor.values.var;

public class Varriable_06 {

	public static void main(String[] args) {
		
		// 정수형 변수선언과 clear
		int num1 = 0;
		Integer num2 = 0;
		
		// Int, Integer로 선언된 변수는 정수값만
		// 저장할 수 있다
		// 최대 -2의 31승 ~ 2의 31승 -1까지 범위만
		//		저장할 수 있다
		num1 = 30;
		num2 = 30;
		
		// -2의 63승 ~ 2의 63승 -1까지 저장가능
		long numLong = 30L;
		Long numLong2 = 30L;
		
		float num3 = 30.111111111F;
		float num4 = 30.111111111F;
		
		double num5 = 30.1111111111111;
		double num6 = 30.111111111111;
		
		System.out.println(num3 * num4);
		
		
	}
}
