package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {
	protected Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + "값을 입력하세요");
			System.out.print(">>");
			String strInput = scan.nextLine();
			Integer intInput;
			if (strInput.equals("QUIT")) {
				return null;
			}
			try {
				intInput = Integer.valueOf(strInput);

			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해주세요");
				continue;
			}
			return intInput;
		}
	}

	public Integer inputValue(String title, int start) {
		String title2 = String.format("%s(%d이상)", title, start);
		while (true) {
			Integer intInput = this.inputValue(title2);
			if (intInput != null) {
				if (intInput < start) {
					System.out.printf("입력값은 %d 이상 이어야 합니다", start);
					continue;
				}
			}
			return intInput;
		}
	}

	public void inputValue(String title, int start, int end) {
		String title2 = String.format("%s(%d~%d범위)",title,start,end);
		while(true) {
			Integer intInput = this.inputValue(title2);
		}
	}
}
