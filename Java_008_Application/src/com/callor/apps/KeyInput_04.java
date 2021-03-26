package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		int num = 0;
		String dLines = LinesService.dLines(25);
		String sLines = LinesService.sLines(25);
		System.out.println(dLines);
		System.out.println("정수 5개를 입력해주세요");
		System.out.println(sLines);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d번째 수 입력 : ", i + 1);
			nums[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		System.out.printf("입력한 수: ");
		for (int i = 0; i < nums.length; i++) {
			if (i <= 3) {
				System.out.printf("%d,", nums[i]);
			} else {
				System.out.print(nums[i]);
			}
			num += nums[i];
		}
		System.out.println();
		System.out.println(sLines);
		System.out.println("합계 :" + num);
		System.out.println(dLines);
	}
}
