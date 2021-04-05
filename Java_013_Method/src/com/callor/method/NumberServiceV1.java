package com.callor.method;

import java.util.Random;

public class NumberServiceV1 {

	Random rnd;

	public NumberServiceV1() {

		rnd = new Random();

	}

	public void inputNum() {

		int num = rnd.nextInt(100) + 1;
		if (num % 3 == 0) {
			
		} else {

		}
	}
}
