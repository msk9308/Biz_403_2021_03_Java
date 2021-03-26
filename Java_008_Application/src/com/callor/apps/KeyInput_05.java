package com.callor.apps;

import java.util.Scanner;

public class KeyInput_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num2 = 0;

		System.out.println("정수를 입력하세요");
		System.out.print("정수입력:");
		num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.printf("입력한 정수 %d는 짝수입니다\n", num);
			num2 = num;
		}else{
			System.out.printf("입력한 정수 %d는 짝수가 아닙니다\n", num);
			num2 = num;
		}
		for (int i = 2; i < num2; i++) {
			if (num2 % i == 0) {
				System.out.printf("입력한 정수 %d는 소수가 아닙니다", num2);
				break;
			}
		}
		if (num < num2) {
			System.out.printf("입력한 정수 %d는 짝수입니다\n", num);
			num2 = num;
		}else{
			System.out.printf("입력한 정수 %d는 짝수가 아닙니다\n", num);
			num2 = num;
		}


	}
}
