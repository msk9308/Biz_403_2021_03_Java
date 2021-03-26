package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {
	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		String dLines = LinesService.dLines(50);
		System.out.println("먼저 정수 1개를 입력하세요");
		System.out.println(dLines);
		System.out.print("정수1>>");
		int num1 = scan.nextInt();
		System.out.println("다음 정수 1개를 입력하세요");
		System.out.print("정수2>>");
		int num2 = scan.nextInt();
		System.out.println(dLines);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 / num2);
		System.out.println(dLines);
		
	
	
	}

}
