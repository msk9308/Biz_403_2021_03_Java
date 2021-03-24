package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] nums = new int[20];
		int num = 0;
		//요소 : 배열의 몇번째값
		//위치 : 배열의 몇번재 
		//첨자 : 배열의 몇번째 인가를 알려주는 값
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				num = i;
			System.out.println(num);
			}
		}
	}
}
