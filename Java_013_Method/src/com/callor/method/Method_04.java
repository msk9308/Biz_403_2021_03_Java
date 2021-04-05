package com.callor.method;

import java.util.Scanner;

public class Method_04 {
	
	public static void main(String[] args) {
		/*
		 * 입력을 받는데 정수 0 ~ 100
		 * 또는 문자열 QUIT
		 * 다른 type의 데이터를 동시에 취급하기 위해서는
		 * 기본 type의 String형으로 설정하는것이 편하다 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0~100까지 중 정수입력");
		System.out.println("QUIT입력하면 종료");
		System.out.print(">>");
		
		// 모든입력을 문자열 type으로 하라
		// 입력받은 문자열을 strNum에 저장하라 
		// int num = scan.nextInt();
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			System.out.println("종료합니다 ");
		}else {
			//QUIT가 아닌 다른값이 입력됬으면 
			//일단 입력된 값을 정수형으로 변환해보자
			//변환된 정수값을 변수에 저장
//			int intNum = Integer.valueOf(strNum);
			Integer intNum2 = Integer.valueOf(strNum);
			
			System.out.println("입력된 정수:" + intNum2);
		}
		int num = scan.nextInt();
		
		System.out.println(num);
		
		
	}

}
