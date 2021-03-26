package com.callor.apps.service;

import java.util.Random;
import java.util.Scanner;

public class ScoreServiceV1 {

	int[] num1;
	int[] num2;
	int[] num3;
	int[] num4;
	int[] num5;
	int sum1;
	int sum2;
	int sum3;
	int sum4;
	int sum5;

	Scanner scan = new Scanner(System.in);

	public ScoreServiceV1() {
		num1 = new int[3];
		num2 = new int[3];
		num3 = new int[3];
		num4 = new int[3];
		num5 = new int[3];

	}

	public void scoreInput() {

		for (int i = 0; i < num1.length; i++) {
			System.out.print("");
			num1[i] = scan.nextInt();
			sum1 += num1[i];
			System.out.print("");
			num2[i] = scan.nextInt();
			sum2 += num2[i];
			System.out.print("");
			num3[i] = scan.nextInt();
			sum3 += num3[i];
			System.out.print("");
			num4[i] = scan.nextInt();
			sum4 += num4[i];
			System.out.print("");
			num5[i] = scan.nextInt();
			sum5 += num5[i];
		}
	}

	public void scoreSum() {

		System.out.printf("첫번째학생 총점: %d 평균: %3.2f\n",sum1,(float)sum1/3);
		System.out.printf("두번째학생 총점: %d 평균: %3.2f\n",sum2,(float)sum2/3);
		System.out.printf("세번째학생 총점: %d 평균: %3.2f\n",sum3,(float)sum3/3);
		System.out.printf("네번째학생 총점: %d 평균: %3.2f\n",sum4,(float)sum4/3);
		System.out.printf("다섯번째학생 총점: %d 평균: %3.2f\n",sum5,(float)sum5/3);

	}

}
