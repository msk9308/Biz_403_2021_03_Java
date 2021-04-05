package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {
	/*
	 * 정수를 키보드에서 입력받다 정수를 return 하거나 : int QUIT를 입력하면 null을 return : AND => Integer
	 * void 대신 Integer
	 */
	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("정수 0 ~ 100까지 중 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.print(">>");
			String strNum = scan.nextLine();

			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				// 1. 입력된 값이 QUIT가 아니면 일단
				// 정수로 바꿔보자

				Integer intNum;
				try {
					intNum = Integer.valueOf(strNum);

					// 2.정수이면 0 ~ 100까지 인지 알아보자
					if (intNum < 0 || intNum > 100) {
						System.out.println("범위를 벗어낫음");
						System.out.println("0~100까지만 입력");
						// 다시 입력하는곳으로 가라
						continue;
					}
					return intNum;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("숫자만 입력하세요");
					// 다시 입력하는 곳으로 가라
					continue;
				}

			}

		}
	}
}
