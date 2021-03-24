package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int[] array = new int[20];
		int sum = 0;
		
		
		for (int i = 0; i < 20; i++) {
			array[i] = rnd.nextInt(100) + 1;
			if (array[i] % 2 == 0) {
				System.out.println( array[i]);
				sum += array[i];
			}		
		}
		
		System.out.printf("합계 : %d\n" , sum);
	}
}
