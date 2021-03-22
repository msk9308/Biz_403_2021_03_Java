package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int sum = 0;
		float avg = 0;
		String stringName = "학생";
		System.out.println("=====================");
		for(int i = 0; i < 10; i++) {
			int num1 = rnd.nextInt(100) + 1;
			int num2= i+1;
			System.out.printf("%s  %d : %d\n", stringName , num2 , num1);
			sum += num1;
		}
		avg = (float)sum /10;
		System.out.println("----------------------");
		System.out.printf("총점 : %d 평균 : %3.2f\n", sum , avg );
		System.out.println("======================");
		
		
		int intNum1 = 0;
		int intNum2 = 0;
		int intNum3 = 0;
		int intNum4 = 0;
		int intNum5 = 0;
		int intNum6 = 0;
		int intNum7 = 0;
		int intNum8 = 0;
		int intNum9 = 0;
		int intNum10 = 0;
		intNum1 = rnd.nextInt(100) + 1;
		intNum2 = rnd.nextInt(100) + 1;
		intNum3 = rnd.nextInt(100) + 1;
		intNum4 = rnd.nextInt(100) + 1;
		intNum5 = rnd.nextInt(100) + 1;
		intNum6 = rnd.nextInt(100) + 1;
		intNum7 = rnd.nextInt(100) + 1;
		intNum8 = rnd.nextInt(100) + 1;
		intNum9 = rnd.nextInt(100) + 1;
		intNum10 = rnd.nextInt(100) + 1;
		int intSum = 0;
		float floatAvg = 0;
		intSum = intNum1 + intNum2 +intNum3 + intNum4 + intNum5 + intNum6 + intNum7 + intNum8 + intNum9 + intNum10;
		floatAvg = (float)intSum / 10;
		
		
		System.out.println("=====================");
		System.out.println("학생 1:" );
		
		
	}
}
