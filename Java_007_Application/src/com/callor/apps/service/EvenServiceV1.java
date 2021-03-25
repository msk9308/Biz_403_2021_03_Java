package com.callor.apps.service;

import java.util.Random;

public class EvenServiceV1 {

	int[] intNum;
	int sum = 0;

	public EvenServiceV1() {
		intNum = new int[100];
	}

	public void makeNums() {
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
	}

	public void printPrime() {
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				sum += intNum[i];
				System.out.println(intNum[i]);
			}
		}
		System.out.println("================");
		System.out.println("합계 : " + sum);
		System.out.println("================");
	}
}
