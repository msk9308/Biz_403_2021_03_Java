package com.callor.method.service;

public class NumberServiceV7 {

	protected String[] strn = { "국어", "영어", "수학", "과학", "국사" };
	protected InputService inService;

	public Integer inputScore() {
		Integer retNum;
		while (true) {
			for (int i = 0; i < strn.length; i++) {
				retNum = inService.inputValue("정수(0~100)");
				if (retNum == null) {
					return null;
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("정수 0 ~ 100");
					continue;
				} else {
					return retNum;
				}
			}
		}
	}
}
