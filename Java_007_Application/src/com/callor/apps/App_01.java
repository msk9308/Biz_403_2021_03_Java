package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] num = new int[20];

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(50) + 51;
			for (int j = 2; j < num[i]-1 ; j++) {
				if(num[i] % j == 0 ) {
					
					break;
				}
				System.out.println(num[i]);
			}
		}
		
	}
}
