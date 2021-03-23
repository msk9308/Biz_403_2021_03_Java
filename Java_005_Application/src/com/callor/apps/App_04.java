package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNum = new int[5];
		int sum = 0;
		System.out.println("========================================================");
		System.out.println("인원수          피자주문          전체조각수 ");
		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			intNum[i] = rnd.nextInt(10) + 50;
			int dev = intNum[i] / 6;
			if (intNum[i] % 6 == 0) {
				System.out.printf("%d                  %d                 %d\n", intNum[i], dev, dev * 6);
				sum += dev;
			} else {
				System.out.printf("%d                  %d                 %d\n", intNum[i], dev + 1, (dev + 1) * 6);
				sum += dev + 1;
			}
		}
		System.out.println("=======================================================");
		System.out.printf("전체 주문 BOX 수량 : %d\n", sum);
	}
}
