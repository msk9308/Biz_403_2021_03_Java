package com.callor.classes;

import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int num = 0;
		num = rnd.nextInt(50) + 51;
		int[] nums = new int[51];

		System.out.println("난수:" + num);
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				nums[i] = i;
				System.out.printf("%d\n", nums[i]);
			}
		}
	}
}