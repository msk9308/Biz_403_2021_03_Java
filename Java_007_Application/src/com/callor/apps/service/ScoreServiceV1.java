package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int sum1;
	int sum2;
	int sum3;
	int sum4;
	int sum5;
	int sumTotal;
	float avg1;
	float avg2;
	
	public ScoreServiceV1() {
		intKor = new int[10];
		intEng = new int[10];
		intMath = new int[10];
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균\t");
		System.out.println("==========================================================");
	}
	
	public void makeScore() {
		Random rnd = new Random();
		for(int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			System.out.printf("%d.\t %d\t" ,i+1,intKor[i] );
			sum1 += intKor[i];
			intEng[i] = rnd.nextInt(100) + 1;
			System.out.printf("%d\t" ,intEng[i] );
			sum2 += intEng[i];
			intMath[i] = rnd.nextInt(100) + 1;
			System.out.printf("%d\t" ,intMath[i] );
			sum3 += intMath[i];
			sum4 = intKor[i] + intEng[i] + intMath[i];
			sum5 +=sum4;
			avg1 = (float)sum4 / 3;
			avg2 += avg1;
			System.out.printf("총점 : %d 평균 : %3.2f\n" , sum4 ,avg1);
			
		}
	}
	public void makeSum() {
		avg2 = (float)avg2/10;
		System.out.println("=======================================================");
		System.out.printf("\t%d\t%d\t%d\t총점 : %d 평균 :%3.2f\n",sum1,sum2,sum3,sum5,avg2);
		System.out.println("-------------------------------------------------------");
		
	}

	
}
