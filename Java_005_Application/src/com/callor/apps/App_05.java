package com.callor.apps;

import java.util.Random;

public class App_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] classScore1 = new int[5];
		int[] classScore2 = new int[5];
		int[] classScore3 = new int[5];
		int num = 0;
		int sum = 0;
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumTotal = 0;
		float avgTotal = 0;
		float avg = 0;
		
		System.out.println("================================================");
		System.out.printf("학번\t 국어\t 영어\t 수학\t 총점\t 평균\n");
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < 5; i++) {
			num = i + 1;
			classScore1[i] = rnd.nextInt(50) + 51;
			classScore2[i] = rnd.nextInt(50) + 51;
			classScore3[i] = rnd.nextInt(50) + 51;
			sumKor += classScore1[i];
			sumEng += classScore2[i];
			sumMath += classScore3[i];
			
			sum = classScore1[i]+classScore2[i]+classScore3[i];
			sumTotal += sum;
			avg = sum / 3;
			avgTotal += avg;
			System.out.printf("%d\t %d\t %d\t %d\t %d\t %3.2f\n", num , classScore1[i] , classScore2[i] , classScore3[i] , sum , avg );
		}
		System.out.println("================================================");	
		System.out.printf("총점\t %d\t %d\t %d\t %d\t %3.2f\n", sumKor ,sumEng ,sumMath, sumTotal, avgTotal  );
	}
}
