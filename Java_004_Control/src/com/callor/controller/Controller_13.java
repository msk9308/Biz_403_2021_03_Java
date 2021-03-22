package com.callor.controller;

import java.util.Random;

public class Controller_13 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(100) + 1;
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("==============");
		System.out.printf(" 합계 : %d\n" , sum);
		System.out.println("==============");
	}
}
