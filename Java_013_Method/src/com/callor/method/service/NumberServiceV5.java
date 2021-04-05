package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(title + "값을 입력하세요");
			System.out.println("");
			System.out.println(">>");

			String strNum = scan.nextLine();
			Integer intNum = null;

			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("숫자만 입력하세요");
					continue;
				}
				if (intNum >= 0 || intNum <= 100) {
					System.out.println("범위를 벗어낫음");
					System.out.println("0~100까지만 입력");
					continue;
				}
				return intNum;
			}

		}

	}
}
