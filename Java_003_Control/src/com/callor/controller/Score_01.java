package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		String strKor= "국어";
		String strEng= "영어";
		String strMath= "수학";
		String strSum= "총점";
		String strAvg= "평균";
		
		int sum = intKor + intEng + intMath;
		int avg = sum / 3;
		
		System.out.println("==================");
		System.out.printf("%s : %d \n" , strKor , intKor);
		System.out.printf("%s : %d \n" , strEng , intEng);
		System.out.printf("%s : %d \n" , strMath , intMath);
		System.out.println("------------------");
		System.out.printf("%s : %d  %s : %d \n" , strSum  , sum , strAvg  , avg );
		System.out.println("------------------");
		
		
	}
}
