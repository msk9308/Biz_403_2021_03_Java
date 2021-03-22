package com.callor.controller;

import java.util.Random;

public class Controller_12 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int sum = 0;
		for(int i = 0; i < 10; i++ ) {
			int num = rnd.nextInt(100) + 1;
			
			if( num % 3 == 0) {
				sum += num;
				System.out.println( num + "는 3의배수" );
			}					
		}
		System.out.println("==================");
		System.out.println("합계 : " + sum);
	}

}
