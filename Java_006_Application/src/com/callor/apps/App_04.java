package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] nums = new int[20];
		int num = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100)+1;
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 3 == 0) {
				num = i;
				System.out.println(num);
				break;
			}
		}
	}
}

